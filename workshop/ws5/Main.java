import pkgBook.Book;
import pkgStudent.Student;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    String title; int pages; double cost; boolean fiction;
    String id, name; double mark;
    title="Hello"; pages=100; cost=30;fiction=true;
    id="S1"; name="Hoa"; mark=7.5;    
    //Book class
    Book x = new Book(title,pages,cost,fiction);
    System.out.println(x); // Hello | 100 | 30 | true
    System.out.println("Title: " + x.getTitle()); // Title:  HE
    System.out.println("Cost: " + x.getCost()); // Cost:  30
    System.out.println("New cost: " + x.getNewCost()); // New cost:  33
    
    //Student class
    Student y = new Student(id,name,mark);
    System.out.println(y); // (S1, Hoa, 7.5) 
  }
}
