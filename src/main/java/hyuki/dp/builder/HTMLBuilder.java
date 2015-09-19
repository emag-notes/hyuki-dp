package hyuki.dp.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Yoshimasa Tanabe
 */
public class HTMLBuilder extends Builder {

  private String fileName;
  private PrintWriter writer;

  @Override
  public void makeTitle(String title) {
    fileName = title + ".html";

    try {
      writer = new PrintWriter(new FileWriter("build/" + fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
    writer.println(String.format("<html><head><title>%s</title></head><body>", title));
    writer.println(String.format("<h1>%s</h1>", title));
  }

  @Override
  public void makeString(String string) {
    writer.println(String.format("<p>%s</p>", string));
  }

  @Override
  public void makeItems(String[] items) {
    writer.println("<ul>");
    for (int i = 0; i < items.length; i++) {
      writer.println(String.format("<li>%s</li>", items[i]));
    }
    writer.println("</ul>");
  }

  @Override
  public void close() {
    writer.println("</body></html>");
    writer.close();
  }

  public String getResult() {
    return fileName;
  }

}
