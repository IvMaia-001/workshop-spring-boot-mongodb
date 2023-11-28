package com.ivanmaiainfo.workshopingmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ivanmaiainfo.workshopingmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
