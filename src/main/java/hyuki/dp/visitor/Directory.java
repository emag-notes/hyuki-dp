package hyuki.dp.visitor;

import java.util.ArrayList;
import java.util.Iterator;
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
    return directory.stream()
      .mapToInt(Entry::getSize)
      .sum();
  }

  @Override
  public Entry add(Entry entry) {
    directory.add(entry);
    return this;
  }

  @Override
  public Iterator<Entry> iterator() throws FileTreatmentException {
    return directory.iterator();
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

}
