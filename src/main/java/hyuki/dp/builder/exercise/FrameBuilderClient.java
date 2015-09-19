package hyuki.dp.builder.exercise;

import javax.swing.*;

/**
 * @author Yoshimasa Tanabe
 */
public class FrameBuilderClient {

  public static void main(String[] args) {

    FrameBuilder frameBuilder = new FrameBuilder();
    Director director = new Director(frameBuilder);

    director.construct();
    JFrame frame = frameBuilder.getResult();
    frame.setVisible(true);
  }

}
