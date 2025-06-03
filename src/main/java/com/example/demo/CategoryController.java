package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

	private CategoryRepository categoryRepository;

	public CategoryController(CategoryRepository categoryRepository, CategoryService categoryService) {
		super();
		this.categoryRepository = categoryRepository;
		this.categoryService = categoryService;
	}

	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}

	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	@GetMapping("/all")
	public List<Category>getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@PostMapping("/add")
	public Category addCategory(@RequestBody Category cat) {
		return categoryService.addCategory(cat);
	}
	
//	@GetMapping("/{id}")
	
}
