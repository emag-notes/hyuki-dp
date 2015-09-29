package hyuki.dp.facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

/**
 * @author Yoshimasa Tanabe
 */
class HtmlWriter {

  private Writer writer;

  public HtmlWriter(Writer writer) {
    this.writer = writer;
  }

  public void title(String title) throws IOException {
    writer.write("<html>");
    writer.write("<head>");
    writer.write(String.format("<title>%s</title>", title));
    writer.write("</head>");
    writer.write("<body>\n");
    writer.write(String.format("<h1>%s</h1>\n", title));
  }

  public void paragraph(String message) throws IOException {
    writer.write(String.format("<p>%s</p>\n", message));
  }

  public void link(String href, String caption) throws IOException {
    paragraph(String.format("<a href=\"%s\">%s</a>", href, caption));
  }

  public void mailto(String mailAddress, String userName) throws IOException {
    link("mailto:" + mailAddress, userName);
  }

  public void close() throws IOException {
    writer.write("</body>");
    writer.write("</html>\n");
    writer.close();
  }

}
