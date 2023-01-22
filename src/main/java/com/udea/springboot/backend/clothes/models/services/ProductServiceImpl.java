package com.udea.springboot.backend.clothes.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udea.springboot.backend.clothes.models.dao.IProductDao;
import com.udea.springboot.backend.clothes.models.entity.Product;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductDao productDao;
	
	@Override
	@Transactional
	public Product save(Product product) {
		return productDao.save(product);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return (List<Product>) productDao.findAll();
	}

}
