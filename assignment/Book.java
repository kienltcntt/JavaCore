package assignment.pro192;
import java.util.Scanner;
public class Book {
    String code;
    String title;
    int quantity;
    double price;

    public Book() {
    }

    public Book(String code, String title, int quantity, double price) {
        this.code = code;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    void input(){
        Scanner wd = new Scanner(System.in);
        System.out.print("Enter code (=0 to exit):");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }
    public String toString(){
        String s = " "+code+ ", " + title + ", " + quantity + ", "+ price;
        return s;
    }
}
