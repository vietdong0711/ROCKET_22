package com.vti.service;

import java.util.List;

import com.vti.entity.Category;

public interface ICategoryService {

	List<Category> findAll();

	void deleteByID(int id);
}
