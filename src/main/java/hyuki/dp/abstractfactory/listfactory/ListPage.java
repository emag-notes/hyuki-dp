package hyuki.dp.abstractfactory.listfactory;

import hyuki.dp.abstractfactory.factory.Item;
import hyuki.dp.abstractfactory.factory.Page;

/**
 * @author Yoshimasa Tanabe
 */
public class ListPage extends Page {

  private static final String LS = System.lineSeparator();

  public ListPage(String title, String author) {
    super(title, author);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();

    sb.append(String.format("<html><head><title>%s</title></head><body>", title)).append(LS)
      .append(String.format("<h1>%s</h1>", title)).append(LS)
      .append("<ul>").append(LS);
    for (Item item : content) {
      sb.append(item.makeHTML());
    }
    sb.append("</ul>").append(LS)
      .append("<hr/>").append(LS)
      .append(String.format("<address>%s</address>", author))
      .append("</body></html>").append(LS);

    return sb.toString();
  }

}
