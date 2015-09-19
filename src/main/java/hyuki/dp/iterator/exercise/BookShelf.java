package hyuki.dp.iterator.exercise;

import hyuki.dp.iterator.Aggregate;
import hyuki.dp.iterator.Book;
import hyuki.dp.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yoshimasa Tanabe
 */
public class BookShelf implements Aggregate {

  private List<Book> books;

  public BookShelf(int initialCapacity) {
    this.books = new ArrayList<>(initialCapacity);
  }

  public Book getBookAt(int index) {
    return books.get(index);
  }

  public void appendBook(Book book) {
    books.add(book);
  }

  public int getLength() {
    return books.size();
  }

  @Override
  public Iterator iterator() {
    return new BookShelfIterator(this);
  }

}
