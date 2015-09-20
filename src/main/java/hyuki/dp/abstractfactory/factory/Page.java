package hyuki.dp.abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yoshimasa Tanabe
 */
public abstract class Page {

  protected String title;
  protected String author;
  protected List<Item> content = new ArrayList<>();

  public Page(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public void add(Item item) {
    content.add(item);
  }

  public void output() {
    String fileName = title + ".html";

    try (FileWriter writer = new FileWriter("build/" + fileName)) {
      writer.write(this.makeHTML());
      System.out.println(String.format("Created %s in 'build' dir.", fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public abstract String makeHTML();

}
