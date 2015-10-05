package hyuki.dp.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Yoshimasa Tanabe
 */
public class BigCharFactory {

  private Map<Character, BigChar> pool = new ConcurrentHashMap<>();

  private static final BigCharFactory singleton = new BigCharFactory();

  private BigCharFactory() {}

  public static BigCharFactory getInstance() {
    return singleton;
  }

  public BigChar getBigChar(char charName) {
    BigChar bigChar = pool.get(charName);

    if (bigChar == null) {
      bigChar = new BigChar(charName);
      pool.put(charName, bigChar);
    }

    return bigChar;
  }
}
