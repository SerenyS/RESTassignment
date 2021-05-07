package edu.wctc.wholesale.services;


import edu.wctc.wholesale.entity.Product;

import edu.wctc.wholesale.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProduct(int productId) {
        List<Product> productList = new ArrayList<>();
        productRepository.findAll().forEach(productList::add);
        return (Product) productList;
    }
}