//Exercise 4.02
package Part2.Exercise4_2;

import Part2.Exercise4_2.Book;

import java.util.Scanner;

public class BookTest
{
  public static void main(String[] args)
  {
    //Instantiating  an object of Scanner class
    Scanner input = new Scanner(System.in);

    //Getting input from user
    System.out.print("Enter author's name: ");
    String bookWriter1 = input.nextLine();
    System.out.print("Enter title: ");
    String bookName1 = input.nextLine();
    System.out.print("Enter price: ");
    double bookPrice1 = input.nextDouble();
    System.out.print("Enter total pages: ");
    int bookPages1 = input.nextInt();
    input.nextLine();
    System.out.print("Enter author's name: ");
    String bookWriter2 = input.nextLine();
    System.out.print("Enter title: ");
    String bookName2 = input.nextLine();
    System.out.print("Enter price: ");
    double bookPrice2 = input.nextDouble();
    System.out.print("Enter total pages: ");
    int bookPages2 = input.nextInt();


    //Instantiating an object of class Book and creating two book objects
    Book book1 = new Book(bookWriter1,bookName1,bookPrice1,bookPages1);
    book1.setPrice(bookPrice1 - 0.2 * bookPrice1);
    System.out.printf("Author1: %s\nTitle1: %s\nPrice1: %.2f\nPages1: %d\n",book1.getAuthor(),book1.getTitle(),book1.getPrice(),book1.getPages());


    Book book2 = new Book(bookWriter2,bookName2,bookPrice2,bookPages2);
    book2.setPrice(bookPrice2 - 0.2 * bookPrice2);
    System.out.printf("Author2: %s\nTitle2: %s\nPrice2: %.2f\nPages2: %d\n",book2.getAuthor(),book2.getTitle(),book2.getPrice(),book2.getPages());

  }

}
