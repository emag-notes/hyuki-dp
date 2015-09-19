package hyuki.dp.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yoshimasa Tanabe
 */
public class Manager {

  private Map<String, Product> showCase = new HashMap<>();

  public void register(String name, Product proto) {
    showCase.put(name, proto);
  }

  public Product create(String protoName) {
    return showCase.get(protoName).createClone();
  }

}
