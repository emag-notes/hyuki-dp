package hyuki.dp.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * &lt;command list&gt; ::= &lt;command&gt;* end
 * @author Yoshimasa Tanabe
 */
public class CommandListNode extends Node {

  private List<Node> commandNodes = new ArrayList<>();

  @Override
  public void parse(Context context) throws ParseException {
    while (true) {
      if (context.currentToken() == null) {
        throw new ParseException("Missing 'end'");
      } else if (context.currentToken().equals("end")) {
        context.skipToken("end");
        break;
      } else {
        Node commandNode = new CommandNode();
        commandNode.parse(context);
        commandNodes.add(commandNode);
      }
    }
  }

  @Override
  public String toString() {
    return commandNodes.toString();
  }

}
