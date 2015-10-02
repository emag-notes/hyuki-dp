package hyuki.dp.observer;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class ObserverTest {

  @Test
  public void test() throws Exception {
    // Setup
    NumberGenerator generator = new RandomNumberGenerator();

    Observer observer1 = new DigitObserver();
    Observer observer2 = new GraphObserver();

    generator.addObserver(observer1);
    generator.addObserver(observer2);

    // Exercise & Verify
    generator.execute();
  }

}