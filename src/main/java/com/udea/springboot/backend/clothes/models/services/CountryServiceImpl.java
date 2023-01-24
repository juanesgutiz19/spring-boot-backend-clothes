package com.udea.springboot.backend.clothes.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udea.springboot.backend.clothes.models.dao.ICountryDao;
import com.udea.springboot.backend.clothes.models.entity.Country;

@Service
public class CountryServiceImpl implements ICountryService{

	@Autowired
	private ICountryDao countryDao;
	
	@Override
	@Transactional(readOnly = true)
	public Country getCountryByCode(String code) {
		return countryDao.findByCode(code);
	}
	
}
