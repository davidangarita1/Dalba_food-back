package com.dangwebs.dalba_foodback.Repositories;

import com.dangwebs.dalba_foodback.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
