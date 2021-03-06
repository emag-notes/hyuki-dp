package hyuki.dp.chainofresponsibility;

/**
 * @author Yoshimasa Tanabe
 */
public class Trouble {

  private int number;

  public Trouble(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return String.format("[Trouble %s]", number);
  }

}
