package hyuki.dp.factorymethod;

import hyuki.dp.factorymethod.framework.Factory;
import hyuki.dp.factorymethod.framework.Product;
import hyuki.dp.factorymethod.idcard.IDCardFactory;
import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class FactoryMethodTest {

  @Test
  public void test() throws Exception {
    // Setup
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("User1");
    Product card2 = factory.create("User2");
    Product card3 = factory.create("User3");

    // Exercise & Verify
    card1.use();
    card2.use();
    card3.use();
  }

  @Test
  public void exercise4_2() throws Exception {
    // Setup
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("User1");
    Product card2 = factory.create("User2");
    Product card3 = factory.create("User3");

    // Exercise & Verify
    card1.use();
    card2.use();
    card3.use();

    System.out.println(((IDCardFactory) factory).getOwners());
  }

}