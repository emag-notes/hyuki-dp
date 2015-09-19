package hyuki.dp.prototype.framework;

/**
 * @author Yoshimasa Tanabe
 */
public interface Product extends Cloneable {

  void use(String s);
  Product createClone();

}
