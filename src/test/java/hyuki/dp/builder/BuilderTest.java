package hyuki.dp.builder;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class BuilderTest {

  @Test
  public void test_Plain() throws Exception {
    // Setup
    TextBuilder textBuilder = new TextBuilder();
    Director director = new Director(textBuilder);

    // Exercise
    director.construct();
    String result = textBuilder.getResult();

    // Verify
    System.out.println(result);
  }

  @Test
  public void test_HTML() throws Exception {
    // Setup
    HTMLBuilder htmlBuilder = new HTMLBuilder();
    Director director = new Director(htmlBuilder);

    // Exercise
    director.construct();
    String fileName = htmlBuilder.getResult();

    // Verify
    System.out.println(String.format("Crated %s in 'build' dir", fileName));
  }
}