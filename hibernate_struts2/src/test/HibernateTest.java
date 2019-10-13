package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Product;
import pojo.Category;

import dao.ProductDAO;
import dao.CategoryDAO;

public class HibernateTest {
	public static void main(String [] args) {
//		Category category = new CategoryDAO().get(3);
//		
//		for(Product p : category.getProducts()) {
//			System.out.println("name: " + p.getName() + " price: " + p.getPrice() + " category: " + p.getCategory().getName());
//		}
		
		Product product = new ProductDAO().get(4);
		System.out.println(product.getCategory().getName());
	}
}
