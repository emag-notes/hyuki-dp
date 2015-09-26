package hyuki.dp.visitor;

import java.util.Iterator;

/**
 * @author Yoshimasa Tanabe
 */
public abstract class Entry implements Element {

  public abstract String getName();
  public abstract int getSize();

  public Entry add(Entry entry) throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  public Iterator iterator() throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  @Override
  public String toString() {
    return String.format("%s (%d)", getName(), getSize());
  }

}
