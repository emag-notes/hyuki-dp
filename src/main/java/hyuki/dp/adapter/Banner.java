package hyuki.dp.adapter;

/**
 * @author Yoshimasa Tanabe
 */
public class Banner {

  private final String string;

  public Banner(String string) {
    this.string = string;
  }

  public void showWithParen() {
    System.out.println(String.format("(%s)", string));
  }

  public void showWithAster() {
    System.out.println(String.format("*%s*", string));
  }

}
