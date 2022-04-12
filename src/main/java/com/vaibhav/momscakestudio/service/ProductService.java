package com.vaibhav.momscakestudio.service;

import com.vaibhav.momscakestudio.dto.ProductDTO;
import com.vaibhav.momscakestudio.model.Product;
import com.vaibhav.momscakestudio.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct()
    {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id)
    {
        return productRepository.findById(id);
    }

    public void addProduct(Product product)
    {
        productRepository.save(product);
    }

    public void removeProductById(Long id)
    {
        productRepository.deleteById(id);
    }

    public List<Product> getAllProductsByCategoryId(int id)
    {
        return productRepository.findAllByCategory_Id(id);
    }
}
