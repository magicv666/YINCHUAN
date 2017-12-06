package com.ssm2.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm2.controller.ProductController;
import com.ssm2.domain.Product;
import com.ssm2.mapper.ProductMapper;

@Service("productDao")
public class ProudctDaoImpl implements ProudctDao{
	
	private static final Log logger = LogFactory.getLog(ProudctDaoImpl.class);

	
//	 ApplicationContext ctx = new ClassPathXmlApplicationContext("conf.xml");
//	 ProductMapper productMapper = (ProductMapper)ctx.getBean("ProductMapper");
	
	@Resource
	private ProductMapper productMapper;

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		int a = productMapper.insert(product);
		logger.info("============success==========" + a);
	}

	@Override
	public List<Product> queryall() {
		// TODO Auto-generated method stub
		
		List<Product> prdList = productMapper.selectall();
		
		return prdList;
	}
	


}
