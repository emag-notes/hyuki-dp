package hyuki.dp.decorator;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class DecoratorTest {

  @Test
  public void test() throws Exception {
    Display b1 = new StringDisplay("Hello, World.");
    System.out.println("=== b1 ===");
    b1.show();

    System.out.println("=== b2 ===");
    Display b2 = new SideBorder(b1, '#');
    b2.show();

    System.out.println("=== b3 ===");
    Display b3 = new FullBorder(b2);
    b3.show();

    System.out.println("=== b4 ===");
    Display b4 =
      new SideBorder(
        new FullBorder(
          new FullBorder(
            new SideBorder(
              new FullBorder(
                new StringDisplay("Hello, Decorator!")
              ), '*'
            )
          )
        ), '/'
      );
      
    b4.show();
  }
}