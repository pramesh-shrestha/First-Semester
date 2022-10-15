package Workshop6;

public class BookTest
{
  public static void main(String[] args)
  {

    Book[] book = new Book[5];
    LibraryBook book1 = new LibraryBook("Ouafa","SDJ", "456215","Beatrica");
    LibraryBook book2 = new LibraryBook("Ouaf","SDJ", "45625","Beatri");

    book[0] = book1;
    book[1] = book2;

    System.out.println(book[0]);
    System.out.println(book[1]);

    book1.loanBook("Rajiv");
    System.out.println(book1);

    book1.returnBook();
    System.out.println(book1);

  }
}
