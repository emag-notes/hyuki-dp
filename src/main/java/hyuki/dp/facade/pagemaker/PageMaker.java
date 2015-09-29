package hyuki.dp.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author Yoshimasa Tanabe
 */
public class PageMaker {

  private PageMaker() {}

  public static void makeWelcomePage(String mailAddress, String fileName) {
    Properties mailProps = Database.getProperties("/hyuki/dp/facade/maildata");
    String userName = mailProps.getProperty(mailAddress);
    try {
      HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
      writer.title(String.format("Welcome to %s's page!", userName));
      writer.paragraph(userName + "のページへようこそ。");
      writer.paragraph("メールまっていますね。");
      writer.mailto(mailAddress, userName);
      writer.close();
      System.out.println(String.format("%s is created for %s (%s)", fileName, mailAddress, userName));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void makeLinkPage(String fileName) {
    Properties mailProps = Database.getProperties("/hyuki/dp/facade/maildata");
    Set<String> mailAddresses = mailProps.stringPropertyNames();

    try {
      HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
      writer.title("Link Page");
      for (String mailAddress : mailAddresses) {
        writer.mailto(mailAddress, mailProps.getProperty(mailAddress));
      }
      writer.close();
      System.out.println(String.format("%s is created.", fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
