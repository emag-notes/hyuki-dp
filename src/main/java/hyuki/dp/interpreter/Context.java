package hyuki.dp.interpreter;

import java.util.StringTokenizer;

/**
 * @author Yoshimasa Tanabe
 */
public class Context {

  private StringTokenizer tokenizer;
  private String currentToken;

  public Context(String text) {
    tokenizer = new StringTokenizer(text);
    nextToken();
  }

  public String nextToken() {
    if (tokenizer.hasMoreTokens()) {
      currentToken = tokenizer.nextToken();
    } else {
      currentToken = null;
    }
    return currentToken;
  }

  public String currentToken() {
    return currentToken;
  }

  public void skipToken(String token) throws ParseException {
    if (!token.equals(currentToken)) {
      throw new ParseException(String.format("Waring: %s is expected, but %s is found.", token, currentToken));
    }
    nextToken();
  }

  public int currentNumber() throws ParseException {
    int number = 0;
    try {
      number = Integer.parseInt(currentToken);
    } catch (NumberFormatException e) {
      throw new ParseException("Warning: " + e);
    }
    return number;
  }

}
