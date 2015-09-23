package hyuki.dp.strategy;

import java.util.Random;

/**
 * @author Yoshimasa Tanabe
 */
public class WinningStrategy implements Strategy {

  private Random random;
  private boolean won = false;
  private Hand previousHand;

  public WinningStrategy(int seed) {
    random = new Random();
  }

  @Override
  public Hand nextHand() {
    if (!won) {
      previousHand = Hand.getHand(random.nextInt(3));
    }
    return previousHand;
  }

  @Override
  public void study(boolean win) {
    won = win;
  }

}
