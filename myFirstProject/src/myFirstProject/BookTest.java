package myFirstProject;

import java.time.LocalDate;

public class BookTest {
	public static void main(String[] args) {
			
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
	
		book1.setBook(101,"JPL","JG", 890, LocalDate.of(2012, 5, 9));
		book2.setBook(102,"PLSQL","SM", 590, LocalDate.of(2009, 5, 9));
		book3.setBook(103,"USS","VPD", 690, LocalDate.of(2023, 3, 13));
		
		book1.printBook();
		book2.printBook();
		book3.printBook();
		
	}
	

}

//class is a design of an object			vs	an object is an instance a class	
class Book 
{
	int bookId; //FILEDS / data member
	String bookName;
	String authorName;
	float bookPrice;
	LocalDate bookPublishingDate;
 
	
	//METHODS / member functions
	public void setBook(int a, String b, String c, float d, LocalDate e) {
		System.out.println("setting inital book details....");
		bookId=a;
		bookName=b;
		authorName=c;
		bookPrice=d;
		bookPublishingDate=e;
	}
	
	public void printBook(){	
		System.out.println("--------------------");
		System.out.println("Book Number  : "+bookId);
		System.out.println("Book Name    : "+bookName);
		System.out.println("Book Author  : "+authorName);
		System.out.println("Book Price   : "+bookPrice);
		System.out.println("Published on : "+bookPublishingDate);
	}
}