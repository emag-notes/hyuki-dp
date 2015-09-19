package hyuki.dp.adapter.impl;

import hyuki.dp.adapter.Banner;

/**
 * @author Yoshimasa Tanabe
 */
public class PrintBanner extends Banner implements Print {

  public PrintBanner(String string) {
    super(string);
  }

  @Override
  public void printWeak() {
    showWithParen();
  }

  @Override
  public void printStrong() {
    showWithAster();
  }

}
