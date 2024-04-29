package com.infy.world.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.infy.world.entity.Country;
import com.infy.world.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService {

	
	@Autowired
	private CountryRepository repo;

	public List<Country> getAll(String cont) {
		// TODO Auto-generated method stub
		

		
		Sort s = Sort.by("name").descending();
		Pageable pagable = PageRequest.of(1, 2,s);
		
		
		return repo.getAll(cont,pagable);
	}
	
	

	

}
