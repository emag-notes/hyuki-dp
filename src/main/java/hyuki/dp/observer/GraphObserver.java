package hyuki.dp.observer;

import java.util.concurrent.TimeUnit;

/**
 * @author Yoshimasa Tanabe
 */
public class GraphObserver implements Observer {

  @Override
  public void update(NumberGenerator generator) {
    System.out.print(GraphObserver.class.getSimpleName() + ":");

    int count = generator.getNumber();
    for (int i = 0; i < count; i++) {
      System.out.print("*");
    }
    System.out.println();

    try {
      TimeUnit.MILLISECONDS.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
