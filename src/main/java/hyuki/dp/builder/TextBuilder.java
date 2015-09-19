package hyuki.dp.builder;

/**
 * @author Yoshimasa Tanabe
 */
public class TextBuilder extends Builder {

  private StringBuilder sb = new StringBuilder();

  @Override
  public void makeTitle(String title) {
    sb.append("======================================")
      .append(System.lineSeparator())
      .append(String.format("「%s」", title))
      .append(System.lineSeparator())
      .append(System.lineSeparator());
  }

  @Override
  public void makeString(String string) {
    sb.append(String.format("■ %s", string))
      .append(System.lineSeparator())
      .append(System.lineSeparator());
  }

  @Override
  public void makeItems(String[] items) {
    for (String item : items) {
      sb.append(String.format("  ・ %s", item))
        .append(System.lineSeparator());
    }
    sb.append(System.lineSeparator());
  }

  @Override
  public void close() {
    sb.append("======================================")
      .append(System.lineSeparator());
  }

  public String getResult() {
    return sb.toString();
  }

}
