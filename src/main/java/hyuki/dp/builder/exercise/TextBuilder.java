package hyuki.dp.builder.exercise;

/**
 * @author Yoshimasa Tanabe
 */
public class TextBuilder extends Builder {

  private StringBuilder sb = new StringBuilder();

  @Override
  public void buildTitle(String title) {
    sb.append("======================================")
      .append(System.lineSeparator())
      .append(String.format("「%s」", title))
      .append(System.lineSeparator())
      .append(System.lineSeparator());
  }

  @Override
  public void buildString(String string) {
    sb.append(String.format("■ %s", string))
      .append(System.lineSeparator())
      .append(System.lineSeparator());
  }

  @Override
  public void buildItems(String[] items) {
    for (String item : items) {
      sb.append(String.format("  ・ %s", item))
        .append(System.lineSeparator());
    }
    sb.append(System.lineSeparator());
  }

  @Override
  public void buildDone() {
    sb.append("======================================")
      .append(System.lineSeparator());
  }

  public String getResult() {
    return sb.toString();
  }

}
