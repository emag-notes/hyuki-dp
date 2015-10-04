package hyuki.dp.state;

import java.util.concurrent.TimeUnit;

/**
 * @author Yoshimasa Tanabe
 */
public class App {

  public static void main(String[] args) {
    SafeFrame frame = new SafeFrame("State Sample");

    while (true) {
      for (int hour = 0; hour < 24; hour++) {

        frame.setClock(hour);

        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }
    }
  }

}
