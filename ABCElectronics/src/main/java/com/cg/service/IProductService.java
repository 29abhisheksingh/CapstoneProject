package com.cg.service;

import java.util.List;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;

public interface IProductService
{
	void addProduct(Product product);
	
	void removeProducts(String product);
	
	List<Product> getProduct(String product);
	
	void updateProductWarranty(String product);
	
	List<Complaint> getProductComplaints(String product);
	
	List<Engineer> getEngineersByProduct(String product);
}
