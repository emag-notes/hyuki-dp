package hyuki.dp.builder.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Yoshimasa Tanabe
 */
public class MarkdownBuilder extends Builder {

  private String fileName;
  private PrintWriter writer;

  @Override
  public void buildTitle(String title) {
    fileName = title + ".md";

    try {
      writer = new PrintWriter(new FileWriter("build/" + fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
    writer.println(String.format("# %s", title));
  }

  @Override
  public void buildString(String string) {
    writer.println(String.format("%s%s%s",
      System.lineSeparator(), string, System.lineSeparator()));
  }

  @Override
  public void buildItems(String[] items) {
    for (String item : items) {
      writer.println(String.format("* %s", item));
    }
  }

  @Override
  public void buildDone() {
    writer.close();
  }

  public String getResult() {
    return fileName;
  }

}
