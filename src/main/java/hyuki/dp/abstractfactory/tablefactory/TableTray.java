package hyuki.dp.abstractfactory.tablefactory;

import hyuki.dp.abstractfactory.factory.Item;
import hyuki.dp.abstractfactory.factory.Tray;

/**
 * @author Yoshimasa Tanabe
 */
public class TableTray extends Tray {

  private static final String LS = System.lineSeparator();

  public TableTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();

    sb.append("<td>")
      .append("<table width=\"100\" border=\"1\"><tr>")
      .append(String.format("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"%d\"><b>%s</b></td>", tray.size(), caption))
      .append("</tr>").append(LS)
      .append("<tr>").append(LS);
    for (Item item : tray) {
      sb.append(item.makeHTML());
    }
    sb.append("</tr></table>").append(LS)
      .append("</td>");

    return sb.toString();
  }
}
