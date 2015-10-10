package hyuki.dp.interpreter;

/**
 * &lt;program&gt; ::= program &lt;command list&gt
 * @author Yoshimasa Tanabe
 */
public class ProgramNode extends Node {

  private Node commandListNode;

  @Override
  public void parse(Context context) throws ParseException {
    context.skipToken("program");
    commandListNode = new CommandListNode();
    commandListNode.parse(context);
  }

  @Override
  public String toString() {
    return String.format("[program %s]", commandListNode);
  }

}
