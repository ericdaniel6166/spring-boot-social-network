package com.example.springbootsocialnetwork.repository;

import com.example.springbootsocialnetwork.entity.Forum;
import com.example.springbootsocialnetwork.entity.Post;
import com.example.springbootsocialnetwork.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByForum(Forum forum);

    List<Post> findByUser(User user);
}
