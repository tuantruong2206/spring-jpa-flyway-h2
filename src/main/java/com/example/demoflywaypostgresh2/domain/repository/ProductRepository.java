package com.example.demoflywaypostgresh2.domain.repository;

import com.example.demoflywaypostgresh2.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByIdIn(List<Long> ids);
}
