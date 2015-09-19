package hyuki.dp.singleton.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yoshimasa Tanabe
 */
public class Triple {

  private int id;

  private static Map<Integer, Triple> instances = new HashMap<Integer, Triple>() {{
    put(0, new Triple(0));
    put(1, new Triple(1));
    put(2, new Triple(2));
  }};

  private Triple(int id) {
    this.id = id;
  }

  public static Triple getInstance(int id) {
    return instances.get(id);
  }

  public int getId() {
    return id;
  }

}
