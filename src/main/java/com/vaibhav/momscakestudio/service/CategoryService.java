package com.vaibhav.momscakestudio.service;

import com.vaibhav.momscakestudio.model.Category;
import com.vaibhav.momscakestudio.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategory()
    {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(int id)
    {
        return categoryRepository.findById(id);
    }
    public void addCategory(Category category)
    {
        categoryRepository.save(category);
    }

    public void removeCategoryById(int id)
    {
        categoryRepository.deleteById(id);
    }
}
