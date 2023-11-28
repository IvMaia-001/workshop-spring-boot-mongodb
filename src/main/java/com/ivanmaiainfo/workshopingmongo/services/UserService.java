package com.ivanmaiainfo.workshopingmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivanmaiainfo.workshopingmongo.domain.User;
import com.ivanmaiainfo.workshopingmongo.repository.UserRepository;
import com.ivanmaiainfo.workshopingmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
