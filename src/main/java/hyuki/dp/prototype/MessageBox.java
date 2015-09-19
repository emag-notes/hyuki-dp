package hyuki.dp.prototype;

/**
 * @author Yoshimasa Tanabe
 */
public class MessageBox extends AbstractProduct {

  private final char decoChar;

  public MessageBox(char decoChar) {
    this.decoChar = decoChar;
  }

  @Override
  public void use(String s) {
    int length = s.getBytes().length;

    printLine(length);
    System.out.println(String.format("%s %s %s", decoChar, s, decoChar));
    printLine(length);

  }

  private void printLine(int length) {
    for (int i = 0; i < length + 4; i++) {
      System.out.print(decoChar);
    }
    System.out.println();
  }
}
