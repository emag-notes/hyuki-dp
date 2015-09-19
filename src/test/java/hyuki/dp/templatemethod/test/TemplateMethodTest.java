package hyuki.dp.templatemethod.test;

import hyuki.dp.templatemethod.AbstractDisplay;
import hyuki.dp.templatemethod.CharDisplay;
import hyuki.dp.templatemethod.StringDisplay;
import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class TemplateMethodTest {

  @Test
  public void test_CharDisplay() throws Exception {
    // Setup
    AbstractDisplay charDisplay = new CharDisplay('H');
    // Exercise & Verify
    charDisplay.display();
  }

  @Test
  public void test_StringDisplay() throws Exception {
    // Setup
    AbstractDisplay stringDisplay = new StringDisplay("Hello, World!");
    // Exercise & Verify
    stringDisplay.display();
  }

  @Test
  public void test_StringDisplayInJapanese() throws Exception {
    // Setup
    AbstractDisplay stringDisplay = new StringDisplay("こんにちは、世界!");
    // Exercise & Verify
    stringDisplay.display();
  }

}