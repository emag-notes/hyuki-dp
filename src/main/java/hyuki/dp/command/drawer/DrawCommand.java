package hyuki.dp.command.drawer;

import hyuki.dp.command.command.Command;

import java.awt.*;

/**
 * @author Yoshimasa Tanabe
 */
public class DrawCommand implements Command {

  protected Drawable drawable;
  private Point position;

  public DrawCommand(Drawable drawable, Point position) {
    this.drawable = drawable;
    this.position = position;
  }

  @Override
  public void execute() {
    drawable.draw(position.x, position.y);
  }

}
