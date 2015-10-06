package hyuki.dp.proxy;

import java.util.concurrent.TimeUnit;

/**
 * @author Yoshimasa Tanabe
 */
public class Printer implements Printable {

  private String name;

  public Printer() {
    heavyJob("Printerのインスタンスを生成中");
  }

  public Printer(String name) {
    this.name = name;
    heavyJob(String.format("Printerのインスタンス(%s)を生成中", name));
  }

  @Override
  public void setPrinterName(String name) {
    this.name = name;
  }

  @Override
  public String getPrinterName() {
    return name;
  }

  @Override
  public void print(String string) {
    System.out.println(String.format("=== %s ===", name));
    System.out.println(string);
  }

  private void heavyJob(String message) {
    System.out.print(message);
    for (int i = 0; i < 5; i++) {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {}
      System.out.print(".");
      System.out.flush();
    }
    System.out.println("完了。");
  }

}
