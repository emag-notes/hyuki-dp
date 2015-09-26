package hyuki.dp.visitor;

/**
 * @author Yoshimasa Tanabe
 */
public interface Element {
  void accept(Visitor v);
}
