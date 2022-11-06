package code;

/**
 * This class is written to represent the details of a book
 * 
 * @author Isuru
 * @version 1.0
 *
 */
public class Book {

	/**
	 * This is to store book name
	 */
	private String book_name;
	/**
	 * This is to store book id
	 */
	private int book_id;
	/**
	 * This is to store book id
	 */
	private int year;
	/**
	 * This is to store author
	 */
	private String author;

	/**
	 * This is the constructor to set all attributes of the book class
	 * 
	 * @param book_name
	 * @param book_id
	 * @param year
	 * @param author
	 */
	public Book(String book_name, int book_id, int year, String author) {
		this.book_name = book_name;
		this.book_id = book_id;
		this.year = year;
		this.author = author;
	}

	public Book() {
	}

	/**
	 * This is method to return book name
	 * @return String
	 */
	public String getBook_name() {
		return book_name;
	}

	/**
	 * This is method to return book
	 * @return int
	 */
	public int getBook_id() {
		return book_id;
	}

	/**
	 * This is method to return year
	 * @return int
	 */
	public int getYear() {
		return year;
	}

	/**
	 * This is method to return author
	 * @return String
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
