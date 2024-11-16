package main;
import model.Book;
import dao.BookDao;
import dao.BookDaoInterface;

public class App {

	public static void main(String[] args) {
		
		Book book=new Book("MadolDoowa","Martin",300.00);
		
		BookDaoInterface bookDao = new BookDao();
		bookDao.saveBook(book);
		
		System.out.println(book.toString());
	}
	
}
