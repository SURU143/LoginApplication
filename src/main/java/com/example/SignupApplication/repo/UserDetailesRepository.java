package com.example.demo.repo;

import com.example.demo.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface UserDetailesRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
