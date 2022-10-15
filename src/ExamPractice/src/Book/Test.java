package Book;

public class Test
{
  public static void main(String[] args)
  {
    PrintedBook p1 = new PrintedBook("asd","asdf",true);
    PrintedBook p2 = new PrintedBook("asdf","asdfd",true);
    Ebook e1 = new Ebook("sddf","sdfasdf","sadfsadf");
    Ebook e2 = new Ebook("sddfsdfs","sdfasdfsdfd","sadfsadfsdfdsf");
    Ebook e3 = new Ebook("sddfsdfs","sdfasdfsdfd","sadfsadfsdfdsf");

    BookList bookList = new BookList();
    bookList.addBook(p1);
    bookList.addBook(p2);
    bookList.addBook(e1);
    bookList.addBook(e2);
    bookList.addBook(e3);


    Book[] temp = bookList.getAllEBooks();
    for (int i = 0; i < temp.length; i++)
    {
      System.out.println(temp[i]);
    }


  }



}
