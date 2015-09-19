package hyuki.dp.singleton;

/**
 * @author Yoshimasa Tanabe
 */
public class Singleton {

  private static Singleton singleton = new Singleton();

  private Singleton() {
    System.out.println("Created a Singleton instance");
  }

  public static Singleton getInstance() {
    return singleton;
  }

}
