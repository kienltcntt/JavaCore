import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
      Scanner u = new Scanner(System.in); int choice;
      MyList t = new MyList();
      while(true) {
        System.out.println("1. Input & add book(s) to the end.");
        System.out.println("2. Display all books.");
        System.out.println("3. Search a book for given code.");
        System.out.println("4. Update the book’s price for given code.");
        System.out.println("5. Find the (first) max price value.");
        System.out.println("6. Sort the list ascendingly by code.");
        System.out.println("7. Remove the book having given code.");
        System.out.println("8. Load data from file.");
        System.out.println("9. Test.");
        System.out.println("0. Exit.");
        System.out.print("   Enter your selection (0 -> 9): ");
        choice = u.nextInt(); u.nextLine();
        if(choice==0) break;
        switch(choice) {
            case 1: 
                    break;
            case 2: 
                    break;
            case 3: 
                    break;
            case 4: 
                    break;
            case 5: 
                    break;
            case 6: 
                    break;
            case 7: 
                    break;
            case 8: 
                    break;
            case 9: System.out.println("(1) Load data and display.");
                    t.loadFile("book.txt");
                    t.traverse();
                    System.out.println("(2) Sort by code and display.");
                    t.sortByCode();
                    t.traverse();
                    break;
            default: System.out.println("Wrong selection");
        }
      }
    }
    
}
