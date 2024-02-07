package com.gchabs.learn.repositories;

import com.gchabs.learn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
