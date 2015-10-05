package hyuki.dp.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Yoshimasa Tanabe
 */
public class BigChar {

  private char charName;
  private String fontData;

  public BigChar(char charName) {
    this.charName = charName;

    try (InputStream is = this.getClass().getResourceAsStream("big" + charName + ".txt");
          BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
      StringBuilder sb = new StringBuilder();
      reader.lines().forEach(line -> {
        sb.append(line);
        sb.append(System.lineSeparator());
      });
      this.fontData = sb.toString();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void print() {
    System.out.println(fontData);
  }

}
