package hyuki.dp.visitor;

/**
 * @author Yoshimasa Tanabe
 */
public abstract class Visitor {

  public abstract void visit(File file);
  public abstract void visit(Directory directory);

}
