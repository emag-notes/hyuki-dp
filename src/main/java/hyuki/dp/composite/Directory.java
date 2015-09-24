package hyuki.dp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yoshimasa Tanabe
 */
public class Directory extends Entry {

  private final String name;
  private List<Entry> directory = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    int size = 0;

    for (Entry entry : directory) {
      size += entry.getSize();
    }

    return size;
  }

  @Override
  public Entry add(Entry entry) {
    directory.add(entry);
    entry.parent = this;
    return this;
  }

  @Override
  protected void printList(String prefix) {
    System.out.println(String.format("%s/%s", prefix, this));

    directory.forEach(
      e -> e.printList(String.format("%s/%s", prefix, name))
    );
  }
}
