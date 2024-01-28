package com.hexaware.springJdbc.dao;

import java.util.List;

import com.hexaware.springJdbc.model.Product;

public interface IProductDao {

	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProductById(int productId);
	public Product selectProductById(int productId);
	public List<Product> selectAllProducts();
}
