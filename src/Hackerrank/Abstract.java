package Hackerrank;

import java.util.*;

abstract class Book
{
	String title;
	String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}

class MyBook extends Book
{
	MyBook(String title, String author, int price){
		super(title, author);
		this.price = price;
	}
	
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + super.title);
		System.out.println("Author: " + super.author);
		System.out.println("Price: " + price);
	}
	
	private int price;
}

public class Abstract {
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      sc.close();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
   }
}
