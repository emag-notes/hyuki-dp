package hyuki.dp.facade;

import hyuki.dp.facade.pagemaker.PageMaker;
import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class FacadeTest {

  @Test
  public void test_makeWelcomePage() throws Exception {
    PageMaker.makeWelcomePage("hyuki@hyuki.com", "build/welcome.html");
  }

  @Test
  public void test_makeLinkPage() throws Exception {
    PageMaker.makeLinkPage("build/linkpage.html");
  }

}