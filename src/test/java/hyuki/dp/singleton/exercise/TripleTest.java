package hyuki.dp.singleton.exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * @author Yoshimasa Tanabe
 */
public class TripleTest {

  @Test
  public void test() throws Exception {
    // Setup & Exercise
    Triple zero = Triple.getInstance(0);
    Triple one = Triple.getInstance(1);
    Triple two = Triple.getInstance(2);

    // Verify
    assertThat(zero.getId(), is(0));
    assertThat(one.getId(), is(1));
    assertThat(two.getId(), is(2));
  }
}