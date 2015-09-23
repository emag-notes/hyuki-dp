package hyuki.dp.strategy;

/**
 * @author Yoshimasa Tanabe
 */
public interface Strategy {

  Hand nextHand();
  void study(boolean win);

}
