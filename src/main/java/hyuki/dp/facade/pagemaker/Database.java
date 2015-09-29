package hyuki.dp.facade.pagemaker;

import java.io.IOException;
import java.util.Properties;

/**
 * @author Yoshimasa Tanabe
 */
class Database {

  private Database() {}

  public static Properties getProperties(String dbName) {
    String fileName = dbName + ".txt";
    Properties props = new Properties();
    try {
      props.load(Database.class.getResourceAsStream(fileName));
    } catch (IOException | NullPointerException e) {
      System.out.println(String.format("Warning: %s is not found.", fileName));
      e.printStackTrace();
    }
    return props;
  }

}
