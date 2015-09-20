package hyuki.dp.abstractfactory.listfactory;

import hyuki.dp.abstractfactory.factory.Item;
import hyuki.dp.abstractfactory.factory.Tray;

/**
 * @author Yoshimasa Tanabe
 */
public class ListTray extends Tray {

  private static final String LS = System.lineSeparator();

  public ListTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();

    sb.append("<li>").append(LS)
      .append(caption).append(LS)
      .append("<ul>").append(LS);
    for (Item item : tray) {
      sb.append(item.makeHTML());
    }
    sb.append("</ul>").append(LS)
      .append("</li>").append(LS);

    return sb.toString();
  }

}
