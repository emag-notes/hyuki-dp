package hyuki.dp.strategy;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class StrategyTest {

  @Test
  public void test() throws Exception {
    // Setup
    int numberOfGames = 10_000;

    int seed1 = 314;
    int seed2 = 15;

    Player player1 = new Player("Taro", new WinningStrategy(seed1));
    Player player2 = new Player("Hana", new ProbStrategy(seed2));

    // Exercise
    for (int i = 0; i < numberOfGames; i++) {
      Hand nextHand1 = player1.nextHand();
      Hand nextHand2 = player2.nextHand();

      if (nextHand1.isStrongerThan(nextHand2)) {
        System.out.println("Winner: " + player1);
        player1.win();
        player2.lose();
      } else if (nextHand2.isStrongerThan(nextHand1)) {
        System.out.println("Winner: " + player2);
        player1.lose();
        player2.win();
      } else {
        System.out.println("Even...");
        player1.even();
        player2.even();
      }
    }

    // Verify
    System.out.println("Total result:");
    System.out.println(player1.toString());
    System.out.println(player2.toString());
  }

}