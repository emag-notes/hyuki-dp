package hyuki.dp.abstractfactory.tablefactory;

import hyuki.dp.abstractfactory.factory.Link;

/**
 * @author Yoshimasa Tanabe
 */
public class TableLink extends Link {

  public TableLink(String caption, String url) {
    super(caption, url);
  }

  @Override
  public String makeHTML() {
    return String.format("<td><a href=\"%s\">%s</a></td>%s", url, caption, System.lineSeparator());
  }

}
