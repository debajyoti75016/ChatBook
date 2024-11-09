package com.chatbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbook.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
	

}
