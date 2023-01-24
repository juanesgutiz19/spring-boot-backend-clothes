package com.udea.springboot.backend.clothes.models.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udea.springboot.backend.clothes.models.entity.Country;

public interface ICountryDao extends JpaRepository<Country, Long>{
	
	public Country findByCode(String code);

}
