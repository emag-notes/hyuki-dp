package hyuki.dp.abstractfactory.factory;

/**
 * @author Yoshimasa Tanabe
 */
public abstract class Factory {

  public static Factory getFactory(String className) {
    Factory factory = null;

    try {
      factory = (Factory) Class.forName(className).newInstance();
    } catch (ClassNotFoundException e) {
      System.err.println(String.format("Not found '%s'", className));
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return factory;
  }

  public abstract Link createLink(String caption, String url);
  public abstract Tray createTray(String caption);
  public abstract Page createPage(String title, String author);

  public Page createYahooPage() {
    Link link = createLink("Yahoo!", "http://www.yahoo.com/");
    Page page = createPage("Yahoo!", "Yahoo!");
    page.add(link);
    return page;
  }

}
