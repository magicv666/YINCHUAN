package com.ssm2.dao;

import java.util.List;

import com.ssm2.domain.Product;

public interface  ProudctDao {
	
	public void save(Product product);
	
	public List<Product> queryall();
}
