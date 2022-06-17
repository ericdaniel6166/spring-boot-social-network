package com.example.springbootsocialnetwork.repository;

import com.example.springbootsocialnetwork.entity.Post;
import com.example.springbootsocialnetwork.entity.User;
import com.example.springbootsocialnetwork.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByIdDesc(Post post, User currentUser);
}
