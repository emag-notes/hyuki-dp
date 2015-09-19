package hyuki.dp.templatemethod;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Yoshimasa Tanabe
 */
public class FooInputStream extends InputStream {
  @Override
  public int read() throws IOException {
    return 0;
  }
}
