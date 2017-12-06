package com.ssm2.mapper;

import java.util.List;

import com.ssm2.domain.Product;

public interface ProductMapper {
	List<Product> selectall();
	
    int insert(Product record);

    int insertSelective(Product record);
}