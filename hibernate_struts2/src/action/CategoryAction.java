package action;

import pojo.Category;
import pojo.Product;

import dao.CategoryDAO;
import dao.ProductDAO;

import java.util.List;

public class CategoryAction {
	private CategoryDAO categoryDAO = new CategoryDAO();
	
	private Category category;
	private List<Category> categorys;
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public void setCategorys(List<Category> categorys) {
		this.categorys = categorys;
	}
	
	public List<Category> getCategorys(){
		return this.categorys;
	}
	
	public String list() {
		this.categorys = categoryDAO.list();
		
		return "listResult";
	}
	
	public String add() {
		categoryDAO.add(this.category);
		
		return "list";
	}
	
	public String edit() {
		this.category = categoryDAO.get(this.category.getId());
		
		return "edit";
	}
	
	public String update() {
		String name = this.category.getName();
		this.category = categoryDAO.get(this.category.getId());
		this.category.setName(name);
		categoryDAO.update(this.category);
		
		return "list";
	}
	
	public String delete() {
		categoryDAO.delete(this.category.getId());
		
		return "list";
	}
}
