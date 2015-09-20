package hyuki.dp.abstractfactory.listfactory;

import hyuki.dp.abstractfactory.factory.Factory;
import hyuki.dp.abstractfactory.factory.Link;
import hyuki.dp.abstractfactory.factory.Page;
import hyuki.dp.abstractfactory.factory.Tray;

/**
 * @author Yoshimasa Tanabe
 */
public class ListFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new ListLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new ListTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    return new ListPage(title, author);
  }

}
