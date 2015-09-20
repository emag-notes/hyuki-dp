package hyuki.dp.abstractfactory.listfactory;

import hyuki.dp.abstractfactory.factory.Link;

/**
 * @author Yoshimasa Tanabe
 */
public class ListLink extends Link {

  public ListLink(String caption, String url) {
    super(caption, url);
  }

  @Override
  public String makeHTML() {
    return String.format("  <li><a href=\"%s\">%s</a></li>\n", url, caption);
  }

}
