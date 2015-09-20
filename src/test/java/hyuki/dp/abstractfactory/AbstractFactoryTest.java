package hyuki.dp.abstractfactory;

import hyuki.dp.abstractfactory.factory.Factory;
import hyuki.dp.abstractfactory.factory.Link;
import hyuki.dp.abstractfactory.factory.Page;
import hyuki.dp.abstractfactory.factory.Tray;
import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class AbstractFactoryTest {

  @Test
  public void test_ListFactory() throws Exception {
    Factory factory = Factory.getFactory("hyuki.dp.abstractfactory.listfactory.ListFactory");
    output(factory);
  }

  @Test
  public void test_TableFactory() throws Exception {
    Factory factory = Factory.getFactory("hyuki.dp.abstractfactory.tablefactory.TableFactory");
    output(factory);
  }

  @Test
  public void test_createYahooPage() throws Exception {
    Factory factory = Factory.getFactory("hyuki.dp.abstractfactory.listfactory.ListFactory");
    Page page = factory.createYahooPage();
    page.output();
  }

  private void output(Factory factory) {
    Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
    Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

    Tray trayNews = factory.createTray("新聞");
    trayNews.add(asahi);
    trayNews.add(yomiuri);

    Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
    Link jp_yahoo = factory.createLink("Yahoo! Japan", "http://www.yahoo.co.jp/");

    Tray trayYahoo = factory.createTray("Yahoo!");
    trayYahoo.add(us_yahoo);
    trayYahoo.add(jp_yahoo);

    Link excite = factory.createLink("Excite", "http://www.excite.com/");
    Link google = factory.createLink("Google", "http://www.google.com");

    Tray traySearchEngine = factory.createTray("サーチエンジン");
    traySearchEngine.add(trayYahoo);
    traySearchEngine.add(excite);
    traySearchEngine.add(google);

    Page page = factory.createPage("LinkPage", "結城 浩");
    page.add(trayNews);
    page.add(traySearchEngine);

    page.output();
  }
}
