package hyuki.dp.interpreter;

/**
 * @author Yoshimasa Tanabe
 */
public abstract class Node {

  public abstract void parse(Context context) throws ParseException;

}
