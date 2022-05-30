package net.kzn.shoppingbackened.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackened.dao.CategoryDAO;
import net.kzn.shoppingbackened.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<Category>();
	
	static {
		categories.add(new Category(1, "Televsison", "This is television descritpion", "NOT AVAILALE", true));
		categories.add(new Category(2, "Mobile", "This is mobile descritpion", "NOT AVAILALE", true));
		categories.add(new Category(3, "Laptop", "This is laptop descritpion", "NOT AVAILALE", true));
	}

	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		for (Category category : categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
