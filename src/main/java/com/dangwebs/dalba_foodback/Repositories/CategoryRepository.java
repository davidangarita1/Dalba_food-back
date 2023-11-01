package com.dangwebs.dalba_foodback.Repositories;

import com.dangwebs.dalba_foodback.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}