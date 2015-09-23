package hyuki.dp.strategy;

import java.util.Random;

/**
 * @author Yoshimasa Tanabe
 */
public class ProbStrategy implements Strategy {

  private Random random;
  private int previousHandValue = 0;
  private int currentHandValue = 0;

  private int[][] history = {
    {1, 1, 1},
    {1, 1, 1},
    {1, 1, 1},
  };

  public ProbStrategy(int seed) {
    this.random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    int bet = random.nextInt(getSum(currentHandValue));
    int handValue = 0;

    if (bet < history[currentHandValue][0]) {
      handValue = 0;
    } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
      handValue = 1;
    } else {
      handValue = 2;
    }

    previousHandValue = currentHandValue;
    currentHandValue = handValue;
    return Hand.getHand(handValue);
  }

  private int getSum(int handValue) {
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += history[handValue][i];
    }
    return sum;
  }

  @Override
  public void study(boolean win) {
    if (win) {
      history[previousHandValue][currentHandValue]++;
    } else {
      history[previousHandValue][(currentHandValue + 1) % 3]++;
      history[previousHandValue][(currentHandValue + 2) % 3]++;
    }
  }
}
