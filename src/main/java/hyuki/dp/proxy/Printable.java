package hyuki.dp.proxy;

/**
 * @author Yoshimasa Tanabe
 */
public interface Printable {

  void setPrinterName(String name);
  String getPrinterName();
  void print(String string);

}
