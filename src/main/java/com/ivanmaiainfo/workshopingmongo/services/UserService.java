package com.ivanmaiainfo.workshopingmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivanmaiainfo.workshopingmongo.domain.User;
import com.ivanmaiainfo.workshopingmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	

}
