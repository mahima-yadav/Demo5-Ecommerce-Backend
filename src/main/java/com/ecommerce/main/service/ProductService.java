package com.ecommerce.main.service;

import com.ecommerce.main.dao.ProductDao;

import com.ecommerce.main.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;
    public Product addNewProduct(Product product){
        return productDao.save(product);
    }
    
    public List<Product> getAllProducts() {
    	return (List<Product>) productDao.findAll();
    }
    
    public Product getProductDetailsById(Integer productId) {
    	return productDao.findById(productId).get();
    }
    
    public void deleteProductDetails(Integer productId) {
    	productDao.deleteById(productId);
    }
}
