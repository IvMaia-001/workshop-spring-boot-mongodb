package com.ivanmaiainfo.workshopingmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ivanmaiainfo.workshopingmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}