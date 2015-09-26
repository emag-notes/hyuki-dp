package hyuki.dp.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Yoshimasa Tanabe
 */
public class FileFindVisitor extends Visitor {

  private final String extension;
  private List<String> foundFiles = new ArrayList<>();

  public FileFindVisitor(String extension) {
    this.extension = extension;
  }

  @Override
  public void visit(File file) {
    if (file.getName().endsWith(extension)) {
      foundFiles.add(file.toString());
    }
  }

  @Override
  public void visit(Directory directory) {
    Iterator<Entry> it = directory.iterator();
    while (it.hasNext()) {
      it.next()
        .accept(this);
    }
  }

  public List<String> getFoundFiles() {
    return foundFiles;
  }

}
