package hyuki.dp.prototype;

import hyuki.dp.prototype.framework.Manager;
import hyuki.dp.prototype.framework.Product;
import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class PrototypeTest {

  @Test
  public void test() throws Exception {
    // Setup
    Manager manager = new Manager();

    UnderlinePen uPen = new UnderlinePen('~');
    MessageBox mBox = new MessageBox('*');
    MessageBox sBox = new MessageBox('/');

    manager.register("strong message", uPen);
    manager.register("warning box", mBox);
    manager.register("slash box", sBox);

    // Exercise & Verify
    Product p1 = manager.create("strong message");
    p1.use("Hello, world.");

    Product p2 = manager.create("warning box");
    p2.use("Hello, world");

    Product p3 = manager.create("slash box");
    p3.use("Hello, world");
  }

}