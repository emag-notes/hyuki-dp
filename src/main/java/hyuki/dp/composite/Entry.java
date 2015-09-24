package hyuki.dp.composite;

/**
 * @author Yoshimasa Tanabe
 */
public abstract class Entry {

  protected Entry parent;

  public abstract String getName();

  public abstract int getSize();

  public Entry add(Entry entry) throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  public void printList() {
    printList("");
  }

  protected abstract void printList(String prefix);

  public String getFullName() {
    StringBuilder fullName = new StringBuilder();
    Entry entry = this;

    do {
      fullName.insert(0, "/" + entry.getName());
      entry = entry.parent;
    } while (entry != null);

    return fullName.toString();
  }

  @Override
  public String toString() {
    return String.format("%s (%d)", getName(), getSize());
  }

}
