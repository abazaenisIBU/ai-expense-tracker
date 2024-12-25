package com.example.aiexpensetracker.core.repository.contracts;

import com.example.aiexpensetracker.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
