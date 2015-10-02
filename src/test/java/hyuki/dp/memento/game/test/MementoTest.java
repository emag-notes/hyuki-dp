package hyuki.dp.memento.game.test;

import hyuki.dp.memento.game.Gamer;
import hyuki.dp.memento.game.Memento;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author Yoshimasa Tanabe
 */
public class MementoTest {

  @Test
  public void test() throws Exception {
    Gamer gamer = new Gamer(100);
    Memento memento = gamer.createMemento();

    for (int i = 0; i < 100; i++) {
      System.out.println("==== " + i);
      System.out.println("現状: " + gamer);

      gamer.bet();

      System.out.println(String.format("所持金は %d 円になりました。", gamer.getMoney()));

      if (gamer.getMoney() > memento.getMoney()) {
        System.out.println("    (だいぶ増えたので、現在の状態を保存しておこう)");
        memento = gamer.createMemento();
      } else if (gamer.getMoney() < memento.getMoney() / 2) {
        System.out.println("    (だいぶ減ったので、以前の状態に復帰しよう)");
        gamer.restoreMemento(memento);
      }

      TimeUnit.SECONDS.sleep(1);

      System.out.println();
    }
  }
}