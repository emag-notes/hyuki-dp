package hyuki.dp.factorymethod.idcard;

import hyuki.dp.factorymethod.framework.Factory;
import hyuki.dp.factorymethod.framework.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Yoshimasa Tanabe
 */
public class IDCardFactory extends Factory {

  private Map<Integer, String> owners = new HashMap<>();
  private AtomicInteger lastNo = new AtomicInteger(100);

  @Override
  protected Product createProduct(String owner) {
    return new IDCard(owner, lastNo.incrementAndGet());
  }

  @Override
  protected void registerProduct(Product product) {
    IDCard card = (IDCard) product;
    owners.put(card.getNo(), card.getOwner());
  }

  public Map<Integer, String> getOwners() {
    return owners;
  }

}
