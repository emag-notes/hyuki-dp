package hyuki.dp.singleton.exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * @author Yoshimasa Tanabe
 */
public class TicketMakerTest {

  @Test
  public void test() throws Exception {
    // Setup
    TicketMaker ticketMaker1 = TicketMaker.getInstance();
    TicketMaker ticketMaker2 = TicketMaker.getInstance();

    // Exercise & Verify
    assertThat(ticketMaker1.getNextTicketMaker(), is(1000));
    assertThat(ticketMaker2.getNextTicketMaker(), is(1001));
    assertThat(ticketMaker1.getNextTicketMaker(), is(1002));
  }
}