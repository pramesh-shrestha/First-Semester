public class StringMethod
{
  public static void main(String[] args)
  {
    String str = "programmer@gmail.com";
    int index = str.indexOf("@");
    String userName = str.substring(0,index);
    String domain = str.substring(index+1);
    System.out.println(userName);
    System.out.println(domain);
  }
}
