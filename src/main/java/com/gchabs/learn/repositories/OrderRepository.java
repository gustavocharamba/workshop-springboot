package com.gchabs.learn.repositories;

import com.gchabs.learn.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
