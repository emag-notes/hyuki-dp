package hyuki.dp.abstractfactory.tablefactory;

import hyuki.dp.abstractfactory.factory.Factory;
import hyuki.dp.abstractfactory.factory.Link;
import hyuki.dp.abstractfactory.factory.Page;
import hyuki.dp.abstractfactory.factory.Tray;

/**
 * @author Yoshimasa Tanabe
 */
public class TableFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new TableLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new TableTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    return new TablePage(title, author);
  }

}
