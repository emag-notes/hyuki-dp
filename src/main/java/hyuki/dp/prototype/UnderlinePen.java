package hyuki.dp.prototype;

/**
 * @author Yoshimasa Tanabe
 */
public class UnderlinePen extends AbstractProduct {

  private final char ulChar;

  public UnderlinePen(char ulChar) {
    this.ulChar = ulChar;
  }

  @Override
  public void use(String s) {
    int length = s.getBytes().length;

    System.out.println(String.format("\"%s\"", s));

    System.out.print(" ");
    for (int i = 0; i < length; i++) {
      System.out.print(ulChar);
    }

    System.out.println();
  }

}
