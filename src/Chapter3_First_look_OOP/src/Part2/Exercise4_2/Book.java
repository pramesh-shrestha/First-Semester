/*
Exercise 4.02
    Create a UML class diagram for a class Book. Then implement it in Java and test it. The
    Book class should have the following fields: author (String), title (String), price (double),
    and pages (int).
    a) Create a 4-argument constructor initializing all fields.
    b) Create get methods for all fields.
    c) Create a set method for price.
    d) Write a test program that creates two Book objects based on user input (use a
    Scanner object to input author, title, price, and pages), then lowers the price
    on both books by 20%, and finally prints out the information about the two
    books.
*/
    package Part2.Exercise4_2;

public class Book
{
  //declaring fields
  private String author;
  private String title;
  private double price;
  private int pages;

  //Creating 4-argument constructor and initializing all fields
  public Book(String author,String title,double price,int pages){
    this.author = author;
    this.title = title;
    this.price = price;
    this.pages  = pages;
  }

  //Creating get methods for all fields
  public String getAuthor() {
    return author;
  }
  public String getTitle() {
    return title;
  }
  public double getPrice() {
    return price;
  }
  public int getPages() {
    return pages;
  }

  //Creating set method for price field
  public void setPrice(double price) {
    this.price = price;
  }
}
