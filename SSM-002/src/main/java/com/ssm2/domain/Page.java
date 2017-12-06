package com.ssm2.domain;

import java.util.List;

public class Page {
	
	private List<Product> prdList;
	
	private Integer totalRows;
	
	private Integer numPerPage;
	
	private Integer currentPage;
	
	private Integer totalPages;

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public List<Product> getPrdList() {
		return prdList;
	}

	public void setPrdList(List<Product> prdList) {
		this.prdList = prdList;
	}

	public Integer getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}

	public Integer getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(Integer numPerPage) {
		this.numPerPage = numPerPage;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	@Override
	public String toString() {
		return "Page [prdList=" + prdList + ", totalRows=" + totalRows + ", numPerPage=" + numPerPage + ", currentPage="
				+ currentPage + ", totalPages=" + totalPages + "]";
	}
	

}
