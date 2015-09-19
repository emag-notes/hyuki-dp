package hyuki.dp.factorymethod.idcard;

import hyuki.dp.factorymethod.framework.Product;

/**
 * @author Yoshimasa Tanabe
 */
public class IDCard extends Product{

  private final String owner;
  private final int no;

  IDCard(String owner, int no) {
    System.out.println(String.format("Create %s(%d) card", owner, no));
    this.owner = owner;
    this.no = no;
  }

  @Override
  public void use() {
    System.out.println(String.format("Use %s(%d) card", owner, no));
  }

  public String getOwner() {
    return owner;
  }

  public int getNo() {
    return no;
  }

}
