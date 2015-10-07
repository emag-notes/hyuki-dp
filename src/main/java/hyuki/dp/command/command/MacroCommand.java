package hyuki.dp.command.command;

import java.util.Stack;

/**
 * @author Yoshimasa Tanabe
 */
public class MacroCommand implements Command {

  private Stack<Command> commands = new Stack<>();

  @Override
  public void execute() {
    commands.forEach(Command::execute);
  }

  public void append(Command command) {
    if (command != this) {
      commands.push(command);
    }
  }

  public void undo() {
    if (!commands.empty()) {
      commands.pop();
    }
  }

  public void clear() {
    commands.clear();
  }

}
