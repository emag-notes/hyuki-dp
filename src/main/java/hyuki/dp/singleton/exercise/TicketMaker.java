package hyuki.dp.singleton.exercise;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Yoshimasa Tanabe
 */
public class TicketMaker {

  private AtomicInteger ticket = new AtomicInteger(1000);

  private static TicketMaker singleton = new TicketMaker();

  private TicketMaker() {}

  public static TicketMaker getInstance() {
    return singleton;
  }

  public int getNextTicketMaker() {
    return ticket.getAndIncrement();
  }

}
