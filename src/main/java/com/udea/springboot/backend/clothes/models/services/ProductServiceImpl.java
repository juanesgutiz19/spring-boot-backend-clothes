package com.udea.springboot.backend.clothes.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udea.springboot.backend.clothes.models.dao.ICountryDao;
import com.udea.springboot.backend.clothes.models.dao.IProductDao;
import com.udea.springboot.backend.clothes.models.entity.Country;
import com.udea.springboot.backend.clothes.models.entity.Product;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductDao productDao;
	
	@Autowired
	private ICountryService countryService;
	
	@Override
	@Transactional
	public Product save(Product product, String countryCode) {
		Country country = countryService.getCountryByCode(countryCode);
		product.setCountry(country);
		return productDao.save(product);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return (List<Product>) productDao.findAll();
	}

}
