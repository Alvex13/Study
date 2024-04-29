package com.infy.world.repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.infy.world.entity.Country;

import jakarta.transaction.Transactional;

public interface CountryRepository extends ListPagingAndSortingRepository<Country, Integer>{

	
	@Query("select c from Country c where continent=?1 ")
	List<Country> getAll(String  coninent,Pageable s);

	
	
	
	
	
}
