package com.udea.springboot.backend.clothes.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.udea.springboot.backend.clothes.models.entity.Product;


public interface IProductDao extends CrudRepository<Product, Long>{

}
