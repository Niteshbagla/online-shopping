package net.kzn.shoppingbackened.dao;

import java.util.List;

import net.kzn.shoppingbackened.dto.Category;

public interface CategoryDAO {

	// Returns list of all categories available
	List<Category> list(); 

	// Returns single category based on category id
	Category get(int id);
}
