package hyuki.dp.bridge;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class BridgeTest {

  @Test
  public void test() throws Exception {
    // Setup
    Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
    Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
    RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Random."));
    Display d5 = new Display(new FileDisplayImpl("src/test/resources/hyuki/dp/bridge/file.txt"));

    // Exercise & Verify
    d1.display();
    d2.display();
    d3.display();
    d3.multiDisplay(5);
    d4.randomDisplay(5);
    d5.display();
  }
}