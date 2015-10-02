package hyuki.dp.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Yoshimasa Tanabe
 */
public class Gamer {

  private static final String[] fruitsName = {
    "リンゴ", "ぶどう", "バナナ", "みかん",
  };

  private static final String DELICIOUS = "おいしい";

  private int money;
  private List<String> fruits = new ArrayList<>();
  private Random random = new Random();

  public Gamer(int money) {
    this.money = money;
  }

  public int getMoney() {
    return money;
  }

  public void bet() {
    int dice = random.nextInt(6) + 1;

    switch (dice) {
      case 1:
        money += 100;
        System.out.println("所持金が増えました。");
        break;
      case 2:
        money /= 2;
        System.out.println("所持金が半分になりました。");
        break;
      case 6:
        String fruit = getFruit();
        System.out.println(String.format("フルーツ(%s)をもらいました。", fruit));
        fruits.add(fruit);
        break;
      default:
        System.out.println("何も起こりませんでした。");
    }
  }

  public Memento createMemento() {
    Memento memento = new Memento(money);
    fruits.stream()
      .filter(fruit -> fruit.startsWith(DELICIOUS))
      .forEach(memento::addFruit);
    return memento;
  }

  public void restoreMemento(Memento memento) {
    this.money = memento.money;
    this.fruits = memento.getFruits();
  }

  private String getFruit() {
    String prefix = "";
    if (random.nextBoolean()) {
      prefix = DELICIOUS;
    }
    return prefix + fruitsName[random.nextInt(fruitsName.length)];
  }

  @Override
  public String toString() {
    return "Gamer{" +
      "money=" + money +
      ", fruits=" + fruits +
      '}';
  }
}
