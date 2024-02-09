package com.gchabs.learn.repositories;

import com.gchabs.learn.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
