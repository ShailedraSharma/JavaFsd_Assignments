package com.hexaware.springJdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springJdbc.config.AppConfig;
import com.hexaware.springJdbc.model.Product;
import com.hexaware.springJdbc.service.IProductService;
import com.hexaware.springJdbc.service.ProductsServiceImp;

public class App 
{
	static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);    
        IProductService service =   context.getBean(ProductsServiceImp.class);
       
    	boolean flag = true;
    	while(flag) {
    		
    		System.out.println("1.insert");
    		System.out.println("2. update");
    		System.out.println("3. delete");
    		System.out.println("4.select by id");
    		System.out.println("5.select all");
    		System.out.println("6.Exit");
    		
    		int choice = scanner.nextInt();
    		switch (choice) {
			case 1:
				Product product = readData();
				boolean isInserted = service.createProduct(product);
				if(isInserted) {
					System.out.println("record inserted sucessfully...");
				}
				break;
			
			case 2: 
				Product product1 = readData();
				boolean isUpdated = service.updateProduct(product1);
				if(isUpdated) {
					System.out.println("Product updated sucessfully");
				}
			
			case 3:
				System.out.println("Enter product id");
				int pid = scanner.nextInt();
				boolean isDeleted = service.deleteProductById(pid);
				if(isDeleted) {
					System.out.println("Product deleted sucessfully..");
				}
			
			case 4:
				System.out.println("Enter product id");
				int pid1 = scanner.nextInt();
				Product productFound = service.selectProductById(pid1);
				if(productFound != null) {
					System.out.println(productFound);
				}else {
					//use exception can be used
					System.err.println("Product not found");
					
				}
				break;
			
			case 5:
				List<Product> list = service.selectAllProducts();
				for(Product prod: list) {
					System.out.println(prod);
				}
				break;
				
			case 6:
				flag = false;
				break;

			default:
				break;
			}
    	}
    }
    
    public static Product readData() {
    	Product product = new Product();
    	System.out.println("Enter product id");
    	product.setProductId(scanner.nextInt());
    	scanner.nextLine();
    	System.out.println("Enter product name");
    	product.setProductName(scanner.nextLine());
    	System.out.println("Enter product price");
    	product.setPrice(scanner.nextDouble());
    	return product;
    }
}
