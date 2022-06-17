package com.example.springbootsocialnetwork.repository;

import com.example.springbootsocialnetwork.entity.Forum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumRepository extends JpaRepository<Forum, Long> {

}
