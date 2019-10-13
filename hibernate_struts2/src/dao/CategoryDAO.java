package dao;

import pojo.Category;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CategoryDAO {
	public void add(Category category) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		s.save(category);
		s.getTransaction().commit();
		
		s.close();
		sf.close();
	}
	
	public void delete(int id) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		Category category = (Category) s.get(Category.class, id);
		s.delete(category);
		s.getTransaction().commit();
		
		s.close();
		sf.close();
	}
	
	public Category get(int id) {
		Category category = null;
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		category = (Category) s.get(Category.class, id);
		s.getTransaction().commit();
		
		s.close();
		sf.close();
		
		return category;
	}
	
	public List<Category> list(){
		List<Category> categoryList = null;
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		Query q = s.createQuery("from Category");
		categoryList = q.list();
		s.getTransaction().commit();
		
		s.close();
		sf.close();
		
		return categoryList;
	}
	
	public void update(Category category) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		s.update(category);
		s.getTransaction().commit();
		
		s.close();
		sf.close();
	}
}
