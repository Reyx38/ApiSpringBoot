package com.reyphill.ApiSpringBoot.repository;

import com.reyphill.ApiSpringBoot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<User, Integer> {
}