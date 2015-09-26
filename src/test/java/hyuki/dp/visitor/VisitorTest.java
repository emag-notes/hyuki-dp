package hyuki.dp.visitor;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class VisitorTest {

  @Test
  public void test() throws Exception {
    System.out.println("Making root entries...");

    Directory root = new Directory("root");
    Directory bin = new Directory("bin");
    Directory tmp = new Directory("tmp");
    Directory usr = new Directory("usr");

    root.add(bin);
    root.add(tmp);
    root.add(usr);

    bin.add(new File("vi", 10_000));
    bin.add(new File("latex", 20_000));

    root.accept(new ListVisitor());
    System.out.println();

    ////////////////////////////////////////////////////////
    System.out.println("Making user entries...");

    Directory yuki = new Directory("yuki");
    Directory hanako = new Directory("hanako");
    Directory tomura = new Directory("tomura");

    usr.add(yuki);
    usr.add(hanako);
    usr.add(tomura);

    yuki.add(new File("diary.html", 100));
    yuki.add(new File("Visitor.java", 200));
    hanako.add(new File("memo.tex", 300));
    tomura.add(new File("game.doc", 400));
    tomura.add(new File("junk.mail", 500));

    root.accept(new ListVisitor());
  }

  @Test
  public void test_FileFindVistor() throws Exception {
    // Setup
    Directory root = new Directory("root");
    Directory bin = new Directory("bin");
    Directory tmp = new Directory("tmp");
    Directory usr = new Directory("usr");

    root.add(bin);
    root.add(tmp);
    root.add(usr);

    bin.add(new File("vi", 10_000));
    bin.add(new File("latex", 20_000));

    Directory yuki = new Directory("yuki");
    Directory hanako = new Directory("hanako");
    Directory tomura = new Directory("tomura");

    usr.add(yuki);
    usr.add(hanako);
    usr.add(tomura);

    yuki.add(new File("diary.html", 100));
    yuki.add(new File("Visitor.java", 200));
    hanako.add(new File("memo.tex", 300));
    hanako.add(new File("index.html", 350));
    tomura.add(new File("game.doc", 400));
    tomura.add(new File("junk.mail", 500));

    // Exercise & Verify
    FileFindVisitor fileFindVisitor = new FileFindVisitor(".html");
    root.accept(fileFindVisitor);

    System.out.println("HTML files are:");
    fileFindVisitor.getFoundFiles()
      .forEach(System.out::println);

  }

  @Test
  public void test_ElementArrayList() throws Exception {
    // Setup
    Directory root1 = new Directory("root1");
    root1.add(new File("diary.html", 10));
    root1.add(new File("index.html", 20));

    Directory root2 = new Directory("root2");
    root2.add(new File("diary.tex", 10));
    root2.add(new File("index.tex", 20));

    // Exercise
    ElementArrayList list = new ElementArrayList();
    list.add(root1);
    list.add(root2);
    list.add(new File("etc.html", 1234));

    // Verify
    System.out.println("All files are:");
    list.accept(new ListVisitor());

    System.out.println("HTML files are:");
    FileFindVisitor ffv = new FileFindVisitor(".html");
    list.accept(ffv);
    ffv.getFoundFiles()
      .forEach(System.out::println);
  }
}