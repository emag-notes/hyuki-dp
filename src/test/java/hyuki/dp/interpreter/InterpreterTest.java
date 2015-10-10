package hyuki.dp.interpreter;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

/**
 * @author Yoshimasa Tanabe
 */
public class InterpreterTest {

  @Test
  public void test() throws Exception {
    try (InputStream is = this.getClass().getResourceAsStream("program.txt");
         BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {

      reader.lines().forEach(text -> {
        System.out.println(String.format("text = \"%s\"", text));
        Node node = new ProgramNode();
        try {
          node.parse(new Context(text));
        } catch (ParseException e) {
          e.printStackTrace();
        }
        System.out.println("node = " + node);
      });
    }
  }
}