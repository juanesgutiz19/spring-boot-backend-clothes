package com.udea.springboot.backend.clothes.models.services;

import java.util.List;

import com.udea.springboot.backend.clothes.models.entity.Product;

public interface IProductService {

	public Product save(Product product, String countryCode);
	
	public List<Product> findAll();
}
