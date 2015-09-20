package hyuki.dp.abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yoshimasa Tanabe
 */
public abstract class Tray extends Item {

  protected List<Item> tray = new ArrayList<>();

  public Tray(String caption) {
    super(caption);
  }

  public void add(Item item) {
    tray.add(item);
  }

}
