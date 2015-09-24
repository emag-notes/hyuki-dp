package hyuki.dp.composite.test;

import hyuki.dp.composite.Directory;
import hyuki.dp.composite.File;
import hyuki.dp.composite.FileTreatmentException;
import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

/**
 * @author Yoshimasa Tanabe
 */
public class CompositeTest {

  @Test
  public void test() throws Exception {
    System.out.println("Making root entries...");

    Directory rootDir = new Directory("root");
    Directory binDir = new Directory("bin");
    Directory tmpDir = new Directory("tmp");
    Directory usrDir = new Directory("usr");

    rootDir.add(binDir);
    rootDir.add(tmpDir);
    rootDir.add(usrDir);

    binDir.add(new File("vi", 10_000));
    binDir.add(new File("latex", 20_000));

    rootDir.printList();

    System.out.println();

    ////////////////////////////////////////////////////
    System.out.println("Making user entries...");

    Directory yukiDir = new Directory("yuki");
    Directory hanakoDir = new Directory("hanako");
    Directory tomuraDir = new Directory("tomura");

    usrDir.add(yukiDir);
    usrDir.add(hanakoDir);
    usrDir.add(tomuraDir);

    yukiDir.add(new File("diary.html", 100));
    yukiDir.add(new File("Composite.java", 200));

    hanakoDir.add(new File("memo,tex", 300));

    tomuraDir.add(new File("game.doc", 400));
    tomuraDir.add(new File("junk.mail", 500));

    rootDir.printList();

  }

  @Test(expected = FileTreatmentException.class)
  public void test_exception() throws Exception {
    new File("foo", 0).add(null);
  }

  @Test
  public void test_getFullName() throws Exception {
    // Setup & Exercise
    Directory rootDir = new Directory("root");

    Directory usrDir = new Directory("usr");
    rootDir.add(usrDir);

    Directory yukiDir = new Directory("yuki");
    usrDir.add(yukiDir);

    File file = new File("Composite.java", 100);
    yukiDir.add(file);

    // Verify
    rootDir.printList();

    assertThat(yukiDir.getFullName(), is("/root/usr/yuki"));
    assertThat(file.getFullName(), is("/root/usr/yuki/Composite.java"));
  }
}