package com.ssm2.domain;

import java.util.Date;

public class Product {
    private String name;

    private String description;

    private Float price;

    private Date productiondate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getProductiondate() {
        return productiondate;
    }

    public void setProductiondate(Date productiondate) {
        this.productiondate = productiondate;
    }

	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", price=" + price + ", productiondate="
				+ productiondate + "]";
	}
    
    
    
}