package JavaProject;

import java.util.ArrayList;

public class JavaProject
{
  private String name;
  private ArrayList<JavaFile> files;

  public JavaProject(String name)
  {
    this.name = name;
    files = new ArrayList<>();
  }
  //addJavaFile
  public void addJavaFile(JavaFile file)
  {
    files.add(file);
  }

  //getFileNAme
  public FileName getFileName(int index)
  {
    return files.get(index).getFileName();
  }
  //getFirstJavaFileWithMainMethod
  public JavaFile getFirstJavaFileWithMainMethod()
  {
    JavaFile java = null;
    for(int i = 0; i < files.size(); i++)
    {
      if(files.get(i).hasAMainMethod())
      {
        java  = files.get(i);
        break;
      }
    }return java;
  }

  //getProjectName()
  public String getProjectName()
  {
    return name;
  }
}
