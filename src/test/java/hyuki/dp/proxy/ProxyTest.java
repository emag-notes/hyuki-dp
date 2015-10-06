package hyuki.dp.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Yoshimasa Tanabe
 */
public class ProxyTest {

  @Test
  public void test() throws Exception {
    Printable p = new PrinterProxy("Alice");
    System.out.println(String.format("名前は現在%sです。", p.getPrinterName()));

    p.setPrinterName("Bob");
    System.out.println(String.format("名前は現在%sです。", p.getPrinterName()));

    p.print("Hello, World.");
  }
}