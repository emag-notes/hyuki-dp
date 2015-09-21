package hyuki.dp.bridge;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Yoshimasa Tanabe
 */
public class FileDisplayImpl extends DisplayImpl {

  private String fileName;

  public FileDisplayImpl(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void rawOpen() {}

  @Override
  public void rawPrint() {
    Path path = Paths.get(fileName);
    try (BufferedReader br =  Files.newBufferedReader(path, Charset.forName(String.valueOf(StandardCharsets.UTF_8)))) {
      br.lines()
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void rawClose() {}

}
