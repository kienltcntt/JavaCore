import java.util.*;
import java.io.*;
public class Main {
 public static void main(String args[]) throws IOException {
    int choice,i; Book x; String xCode; double xPrice;
    Scanner sc = new Scanner(System.in);
    BookList u = new BookList();
    String fname;
    while(true){
        System.out.println("1. Input & add book(s) to the end.");
        System.out.println("2. Display all books.");
        System.out.println("3. Search a book for given code.");
        System.out.println("4. Update the bookâ€™s price for given code.");
        System.out.println("5. Find the (first) max price value.");
        System.out.println("6. Sort the list ascendingly by code.");
        System.out.println("7. Remove the book having given code.");
        System.out.println("8. Load data from file.");
        System.out.println("9. Test.");
        System.out.println("0. Exit.");
        System.out.println("   Enter your selection (0 -> 9): ");
        choice = sc.nextInt(); sc.nextLine();
      if(choice==0) break;
      switch(choice){
        //add book
        case 1: u.input();
                break;
        //booklist        
        case 2: u.display();
                break;
        //search book use id
        case 3: System.out.print("Enter code: ");
                xCode = sc.nextLine();
                i = u.searchByCode(xCode);
                if(i==-1)
                  System.out.println("Not found.");
                else {
                  System.out.println("Found at the position " + i);
                  System.out.println(u.t.get(i));
                }
                break;
        //update newprice from id
        case 4: System.out.print("Enter code: ");
                xCode = sc.nextLine();
                System.out.print("Enter new price: ");
                xPrice = sc.nextDouble();
                u.update(xCode, xPrice);
                u.display();
                break;
        //find most valueable book
        case 5: if(u.checkEmpty()) break;
                i = u.max();
                System.out.println("Max is at the position " + i);
                System.out.println(u.t.get(i));
                break;
        //sort through code
        case 6: u.sortByCode();
                u.display();
                break;
        //remove use code
        case 7: System.out.print("Enter code: ");
                xCode = sc.nextLine();
                u.display();
                u.remove(xCode);
                u.display();
                break;
        //print book info
        case 8: System.out.print("Enter file name (b = book.txt): ");
                fname = sc.nextLine();
                if(fname.trim().equalsIgnoreCase("b")) 
                    fname = "book.txt";
                u.loadFile(fname);
                break;
        case 9: System.out.println("(1) Load data and display.");
            u.loadFile("book.txt");
            u.display();
            System.out.println("(2) Sort by title and display.");
            u.sortByCode();
            u.display();
            System.out.println("(3) Sort by quantity and display.");
            u.sortByqQantity();
            u.display();
            System.out.println("(4) Find max price, change price to 99 and display.");
            u.changeMax();
            u.display();
        default:
            System.out.print("Wrong selection!");
       }
     }      
    System.out.println();
   }
}
