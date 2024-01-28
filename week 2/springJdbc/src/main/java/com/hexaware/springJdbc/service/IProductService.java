package com.hexaware.springJdbc.service;

import java.util.List;

import com.hexaware.springJdbc.model.Product;

public interface IProductService {

	
	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProductById(int productId);

	public Product selectProductById(int productId);

	public List<Product> selectAllProducts();
}
