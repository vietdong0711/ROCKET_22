package com.vti.controller.admin;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.CategoryDTO;
import com.vti.entity.Category;
import com.vti.service.ICategoryService;

@RestController("AdminCatgoryController")
@RequestMapping(value = "api/admin/category")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private ICategoryService categoryService;

	@GetMapping
	public ResponseEntity<?> getAllCategory() {
		List<Category> categories = categoryService.findAll();
		List<CategoryDTO> categoryDTOs = new ArrayList<>();
		for (Category category : categories) {
			CategoryDTO categoryDTO = mapper.map(category, CategoryDTO.class);
			categoryDTOs.add(categoryDTO);
		}

		return new ResponseEntity<>(categoryDTOs, HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteByID(@PathVariable(name = "id") int id) {
		categoryService.deleteByID(id);
		return new ResponseEntity<>("delete succesfully", HttpStatus.OK);
	}
}
