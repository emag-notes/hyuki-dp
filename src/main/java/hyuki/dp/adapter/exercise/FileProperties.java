package hyuki.dp.adapter.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * @author Yoshimasa Tanabe
 */
public class FileProperties implements FileIO {

  Properties props = new Properties();

  @Override
  public void readFromFile(String fileName) throws IOException {
    InputStream file = this.getClass().getResourceAsStream(fileName);
    if (file != null) {
      props.load(this.getClass().getResourceAsStream(fileName));
      return;
    }

    try(Reader reader = new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8)) {
      props.load(reader);
    }
  }

  @Override
  public void writeToFile(String fileName) throws IOException {
    try(Writer writer = new OutputStreamWriter(new FileOutputStream(fileName), StandardCharsets.UTF_8)) {
      props.store(writer, "written by FileProperties");
    }
  }

  @Override
  public void setValue(String key, String value) {
    props.setProperty(key, value);
  }

  @Override
  public String getValue(String key) {
    return props.getProperty(key, "");
  }

}
