
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();    
    String authorToFind = "L. Frank Baum";
    String bookToFind = "Sky Island";
    double minimumRating = 0.0;
    for (Book book: childrensBooks) {
      //if (book.getAuthor().equals(authorToFind)) {
        //System.out.println(book.getTitle() + ", by " + authorToFind);
      //}
      if (book.getAuthor().equals(authorToFind) && book.getTitle().equals(bookToFind)) {
        minimumRating = book.getRating();
      }
    }
    for (Book book : childrensBooks) {
      if (book.getRating() >= minimumRating) {
        System.out.println(book.getTitle() + ", by " + book.getAuthor());
      }
    }
    
  }
}
