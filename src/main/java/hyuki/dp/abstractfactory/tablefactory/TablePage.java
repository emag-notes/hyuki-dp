package hyuki.dp.abstractfactory.tablefactory;

import hyuki.dp.abstractfactory.factory.Item;
import hyuki.dp.abstractfactory.factory.Page;

/**
 * @author Yoshimasa Tanabe
 */
public class TablePage extends Page {

  private static final String LS = System.lineSeparator();

  public TablePage(String title, String author) {
    super(title, author);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();

    sb.append(String.format("<html><head><title>%s</title></head><body>", title)).append(LS)
      .append(String.format("<h1>%s</h1>", title)).append(LS)
      .append("<table width=\"80\" border=\"3\">").append(LS);
    for (Item item : content) {
      sb.append(String.format("<tr>%s<tr>", item.makeHTML()));
    }
    sb.append("</table>").append(LS)
      .append("<hr/>").append(LS)
      .append(String.format("<address>%s</address>", author))
      .append("</body></html>");

    return sb.toString();
  }

}
