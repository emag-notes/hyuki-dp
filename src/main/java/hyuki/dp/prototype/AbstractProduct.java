package hyuki.dp.prototype;

import hyuki.dp.prototype.framework.Product;

/**
 * @author Yoshimasa Tanabe
 */
public abstract class AbstractProduct implements Product {

  @Override
  public Product createClone() {
    Product p = null;
    try {
      p = (Product) clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return p;
  }

}
