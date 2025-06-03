package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}

	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}
	
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	



//	public List<String> getCategoryNames() {
//		
//		Iterable<Category> categoryIter = this.categoryRepository.findAll();
//		List<String>categories = new ArrayList<String>();
//		
//		for (Category cat: categoryIter) {
//			categories.add(cat.getCategoryName());
//		}
//		
//		return categories;
//	}
//	
//	public String addCategory(int id, String name, String description) {
//		Category newCat = new Category(id, name, description);
//		Category returnCat = this.categoryRepository.save(newCat);
//		
//		return returnCat.getCategoryName();
//	}
//

	
	
}
