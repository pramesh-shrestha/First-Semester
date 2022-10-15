package JavaProject;

public class JavaFile
{
  private boolean hasAMainMethod;
  private FileName fileName;

  public JavaFile (String fileName)
  {
    hasAMainMethod = false;
    this.fileName = new FileName(fileName,"java");
  }

  //getFileNAme
  public FileName getFileName()
  {
    return fileName.copy();
  }

  //hasAMainMethod
  public boolean hasAMainMethod()
  {
    return hasAMainMethod;
  }
  //addAMainMethod()
  public void addAMainMethod()
  {
    hasAMainMethod = true;
  }
}
