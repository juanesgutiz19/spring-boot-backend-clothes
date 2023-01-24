package com.udea.springboot.backend.clothes.models.services;

import com.udea.springboot.backend.clothes.models.entity.Country;

public interface ICountryService {

	public Country getCountryByCode(String code);
	
}
