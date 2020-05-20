package com.hiernate.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {
	protected SessionFactory sessionFactory;


	protected void setUp() {
		final StandardServiceRegistry registry=new StandardServiceRegistryBuilder()
				.configure()
				.build();
		sessionFactory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
		
	}
	protected void exit() {
		sessionFactory.close();
	}
	protected void create() {
		Book book=new Book();
		book.setTitle("Java Version3");
		book.setAuthor("James");
		book.setPrice(45.65f);
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		System.out.println("id==="+book.getBookId());
		session.save(book);
		
		session.getTransaction().commit();
		session.close();
	}
	public static void main(String args[]) {
		BookManager bookManager=new BookManager();
		bookManager.setUp();		
		
		bookManager.create();
		
		bookManager.exit();
	}
}