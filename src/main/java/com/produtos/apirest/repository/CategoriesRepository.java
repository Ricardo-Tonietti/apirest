package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long>{
	
	

}
