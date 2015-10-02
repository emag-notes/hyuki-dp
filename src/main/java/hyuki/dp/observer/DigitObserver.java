package hyuki.dp.observer;

import java.util.concurrent.TimeUnit;

/**
 * @author Yoshimasa Tanabe
 */
public class DigitObserver implements Observer {

  @Override
  public void update(NumberGenerator generator) {
    System.out.println(DigitObserver.class.getSimpleName() + ":" + generator.getNumber());
    try {
      TimeUnit.MILLISECONDS.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
