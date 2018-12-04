package com.example.FileTracker.repositories;

import com.example.FileTracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
