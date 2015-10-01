package hyuki.dp.mediator;

import java.awt.*;

/**
 * @author Yoshimasa Tanabe
 */
public class ColleagueButton extends Button implements Colleague {

  private Mediator mediator;

  public ColleagueButton(String caption) {
    super(caption);
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
  }

}
