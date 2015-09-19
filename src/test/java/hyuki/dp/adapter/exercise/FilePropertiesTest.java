package hyuki.dp.adapter.exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * @author Yoshimasa Tanabe
 */
public class FilePropertiesTest {

  private static final String SRC_FILE = "file.txt";
  private static final String DIST_FILE = "build/newfile.txt";

  @Test
  public void test() throws Exception {
    // Setup
    FileIO f = new FileProperties();
    f.readFromFile(SRC_FILE);
    assertThat(f.getValue("year"), is("1999"));
    assertThat(f.getValue("month"), is(""));
    assertThat(f.getValue("month"), is(""));

    // Exercise
    f.setValue("year", "2015");
    f.setValue("month", "9");
    f.setValue("day", "19");
    f.writeToFile(DIST_FILE);

    // Verify
    f.readFromFile(DIST_FILE);
    assertThat(f.getValue("year"), is("2015"));
    assertThat(f.getValue("month"), is("9"));
    assertThat(f.getValue("day"), is("19"));
  }
}
