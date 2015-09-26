package hyuki.dp.visitor;

import java.util.ArrayList;

/**
 * @author Yoshimasa Tanabe
 */
public class ElementArrayList extends ArrayList<Element> implements Element {

  @Override
  public void accept(Visitor v) {
    this.forEach(e -> e.accept(v));
  }

}
