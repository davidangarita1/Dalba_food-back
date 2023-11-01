package com.dangwebs.dalba_foodback.Services;

import com.dangwebs.dalba_foodback.Entities.Category;
import com.dangwebs.dalba_foodback.Mappers.CategoryMapper;
import com.dangwebs.dalba_foodback.Repositories.CategoryRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    public void deleteCategory(Integer id){
        categoryRepository.deleteById(id);
    }
}
