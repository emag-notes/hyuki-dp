package hyuki.dp.adapter.delegate;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class AdapterTest {

  @Test
  public void test() throws Exception {
    // Setup
    Print p = new PrintBanner("Hello");

    // Exercise & Verify
    p.printWeak();
    p.printStrong();
  }

}
