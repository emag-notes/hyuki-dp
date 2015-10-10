package hyuki.dp.interpreter;

/**
 * &lt;primitive command&gt; ::= go | right | left
 * @author Yoshimasa Tanabe
 */
public class PrimitiveCommandNode extends Node {

  private String name;

  @Override
  public void parse(Context context) throws ParseException {
    name = context.currentToken();
    context.skipToken(name);

    if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
      throw new ParseException(String.format("%s is undefined", name));
    }
  }

  @Override
  public String toString() {
    return name;
  }

}
