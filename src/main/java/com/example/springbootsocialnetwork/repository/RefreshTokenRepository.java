package com.example.springbootsocialnetwork.repository;

import com.example.springbootsocialnetwork.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
}
