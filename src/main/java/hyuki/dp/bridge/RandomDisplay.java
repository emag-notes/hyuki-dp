package hyuki.dp.bridge;

import java.util.Random;

/**
 * @author Yoshimasa Tanabe
 */
public class RandomDisplay extends Display {

  public RandomDisplay(DisplayImpl impl) {
    super(impl);
  }

  public void randomDisplay(int times) {
    open();
    for (int i = 0; i < new Random().nextInt(times) + 1; i++) {
      print();
    }
    close();
  }

}
