package com.ivanmaiainfo.workshopingmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivanmaiainfo.workshopingmongo.domain.Post;
import com.ivanmaiainfo.workshopingmongo.repository.PostRepository;
import com.ivanmaiainfo.workshopingmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	}


