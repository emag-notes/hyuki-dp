package hyuki.dp.state;

/**
 * @author Yoshimasa Tanabe
 */
public interface Context {

  void setClock(int hour);
  void changeState(State state);
  void callSecurityCenter(String message);
  void recordLog(String message);

}
