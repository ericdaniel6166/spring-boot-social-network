package com.example.springbootsocialnetwork.repository;

import com.example.springbootsocialnetwork.entity.Comment;
import com.example.springbootsocialnetwork.entity.Post;
import com.example.springbootsocialnetwork.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
