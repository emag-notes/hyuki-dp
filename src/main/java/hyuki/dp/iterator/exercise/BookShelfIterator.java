package hyuki.dp.iterator.exercise;

import hyuki.dp.iterator.Book;
import hyuki.dp.iterator.Iterator;

/**
 * @author Yoshimasa Tanabe
 */
public class BookShelfIterator implements Iterator {

  private BookShelf bookShelf;
  private int index;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    return index < bookShelf.getLength();
  }

  @Override
  public Object next() {
    Book book = bookShelf.getBookAt(index);
    index++;
    return book;
  }

}