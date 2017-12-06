package com.ssm2.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.jdbc.util.PropertiesDocGenerator;
import com.ssm2.dao.ProudctDao;
import com.ssm2.domain.Page;
import com.ssm2.domain.Product;
import com.ssm2.mapper.ProductMapper;

@Controller
public class ProductController {
	
	private static final Log logger = LogFactory.getLog(ProductController.class);
	
	private static final int NUM_PER_PAGE = 5;
	
	@Resource
	private ProudctDao productDao;

	@RequestMapping(value = "/product_input")
	public String inputProduct(Model model){
		
		logger.info("=============inputProduct is called!================");
		Product product = new Product();
		product.setName("caiwei");
		product.setDescription("this is a book");
		productDao.save(product);
		model.addAttribute("product",product);
		return "ProductForm";
	}
	
	
	@RequestMapping(value = "/product_save")
	public String saveProduct(@ModelAttribute Product product,BindingResult bindingResult,Model model){
		logger.info(" saveProduct is called!");
		
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			logger.info("-----code:" + fieldError.getCode() + ",object:" + fieldError.getObjectName() 
			            + ",field:" + fieldError.getField());
			 
			return "ProductForm";
		}
		
		model.addAttribute("product",product);
		
		return "ProductDetails";
	}
	
	@RequestMapping(value = "/queryall")
	public String queryAllProduct(Model model){
		
		logger.info("### queryAllProduct is called! ###");
		
		List<Product> list = productDao.queryall();
		
		for (Product product : list) {

			logger.info("### " + product.toString() + " ###");
		}
		
		Page page = new Page();
		
		page.setCurrentPage(1);
		page.setNumPerPage(NUM_PER_PAGE);
		page.setTotalRows(list.size());
		page.setTotalPages(list.size()/NUM_PER_PAGE + 1);
		page.setPrdList(list.subList(0, NUM_PER_PAGE ));
		
		logger.info("### page.toString() = " + page.toString() + " ###");
		model.addAttribute("page",page);
		
		return "productDatagrid";
	}
	
	@RequestMapping(value = "/querypage")
	public String queryAjax(HttpServletRequest hRequest,Model model){
		
		logger.info("### queryAjax is called! ###");
		
		List<Product> list = productDao.queryall();
		
		int pageNum = Integer.parseInt(hRequest.getParameter("pageNum"));
		if (pageNum > list.size()/NUM_PER_PAGE + 1) {
			pageNum = list.size()/NUM_PER_PAGE + 1;
		}
		
		Page page = new Page();
		
		page.setCurrentPage(pageNum);
		page.setNumPerPage(NUM_PER_PAGE);
		page.setTotalRows(list.size());
		page.setTotalPages(list.size()/NUM_PER_PAGE + 1);
		
		//页码不能超过总的页数
		if (pageNum > (list.size()/NUM_PER_PAGE + 1)) {
			pageNum = list.size()/NUM_PER_PAGE + 1;
		}
		page.setPrdList(list.subList(NUM_PER_PAGE * (pageNum - 1), NUM_PER_PAGE * pageNum < list.size()?NUM_PER_PAGE * pageNum:list.size()));
		
		logger.info("### queryAjax is finished! ###");
		logger.info("page = " + page);
		
		model.addAttribute("page",page);
		
		return "productDatagrid";
	
	}
}
