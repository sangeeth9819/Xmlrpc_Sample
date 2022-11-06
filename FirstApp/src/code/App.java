/**
 * 
 */
package code;

/**
 * @author uobsep22
 *
 */
public class App {
	/**
	 * This is object of book class
	 * @see Book
	 * @see "Refer how to write class"
	 */
	static Book book;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		book = new Book("Secret", 1, 1997, "Isuru");
		String details = book.getBook_name() + " " + book.getYear() + " "+book.getAuthor();
		System.out.print(details);

	}

}
