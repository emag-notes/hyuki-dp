package hyuki.dp.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

/**
 * @author Yoshimasa Tanabe
 */
public class SingletonTest {

  @Test
  public void test() throws Exception {
    // Setup
    System.out.println("Started.");
    
    // Exercise
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();

    // Verify
    boolean isSameInstance = instance1 == instance2;
    assertThat(isSameInstance, is(true));
  }

}