package com.gchabs.learn.repositories;

import com.gchabs.learn.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
