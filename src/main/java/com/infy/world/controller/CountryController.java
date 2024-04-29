package com.infy.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.world.entity.Country;
import com.infy.world.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/get/{continent}")
	public List<Country> getAll(@PathVariable("continent") String cont){
		
		return countryService.getAll(cont);
	}
	
	
}
