package dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.Session;

import model.Book;
import util.HibernateUtil;

public class BookDao implements BookDaoInterface{

	@Override
	public void saveBook(Book book) {
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();
			session.persist(book);
			transaction.commit();
			
		}catch(Exception e) {
			
			if(transaction !=null) {
				transaction.rollback();
			}
			
		}
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookByName(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
