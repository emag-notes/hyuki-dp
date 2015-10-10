package hyuki.dp.interpreter;

/**
 * &lt;repeat command&gt; ::= repeat &lt;number&gt; &lt;command list&gt;
 * @author Yoshimasa Tanabe
 */
public class RepeatCommandNode extends Node {

  private int number;
  private Node commandListNode;

  @Override
  public void parse(Context context) throws ParseException {
    context.skipToken("repeat");
    number = context.currentNumber();
    context.nextToken();
    commandListNode = new CommandListNode();
    commandListNode.parse(context);
  }

  @Override
  public String toString() {
    return String.format("[repeat %d %s]", number, commandListNode);
  }
}
