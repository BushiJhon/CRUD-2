package action;

import pojo.Product;
import pojo.Category;

import java.util.List;
import java.util.ArrayList;

import dao.ProductDAO;
import dao.CategoryDAO;

public class ProductAction {
	private ProductDAO productDAO = new ProductDAO();
	private CategoryDAO categoryDAO = new CategoryDAO();
	
	private Product product;
	private Category category;
	private List<Product> products;
	private List<Category> categorys;
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public List<Product> getProducts(){
		return this.products;
	}
	
	public void setCategorys(List<Category> categorys) {
		this.categorys = categorys;
	}
	
	public List<Category> getCategorys(){
		return this.categorys;
	}
	
	public String list() {
		if(this.category == null) {
			this.setProducts(productDAO.list());
		}else {
			this.category = categoryDAO.get(this.category.getId());
			this.products = new ArrayList(this.category.getProducts());
		}
		
		this.setCategorys(categoryDAO.list());
		return "listResult";
	}
	
	public String add() {
		productDAO.add(this.product);
		
		return "list";
	}
	
	public String edit() {
		this.product = productDAO.get(this.product.getId());
		this.categorys = categoryDAO.list();
		
		return "edit";
	}
	
	public String update() {
		productDAO.update(this.product);
		
		return "list";
	}
	
	public String delete() {
		productDAO.delete(this.product.getId());
		
		return "list";
	}
}
