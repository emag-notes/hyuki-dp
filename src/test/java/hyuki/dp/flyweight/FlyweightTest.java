package hyuki.dp.flyweight;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class FlyweightTest {

  @Test
  public void test() throws Exception {
    // Setup
    BigString bigString = new BigString("1212123");
    // Exercise & Verify
    bigString.print();
  }

  @Test
  public void bench_mark_shared() throws Exception {
    // Setup
    BigString[] bigStrings = new BigString[1000];

    // Exercise
    long start = System.nanoTime();
    for (int i = 0; i < bigStrings.length; i++) {
      bigStrings[i] = new BigString("121213", true);
    }
    long end = System.nanoTime();

    // Verify
    System.out.println(String.format("Elapsed time: %d ms", (end - start) / 1_000_000));
    System.out.println(String.format("Used Memory: %d KB", getUsedMemory() / 1024));
  }

  @Test
  public void bench_mark_unshared() throws Exception {
    // Setup
    BigString[] bigStrings = new BigString[1000];

    // Exercise
    long start = System.nanoTime();
    for (int i = 0; i < bigStrings.length; i++) {
      bigStrings[i] = new BigString("121213", false);
    }
    long end = System.nanoTime();

    // Verify
    System.out.println(String.format("Elapsed time: %d ms", (end - start) / 1_000_000));
    System.out.println(String.format("Used Memory: %d KB", getUsedMemory() / 1024));
  }

  private static long getUsedMemory() {
    Runtime runtime = Runtime.getRuntime();
    runtime.gc();
    return runtime.totalMemory() - runtime.freeMemory();
  }

}