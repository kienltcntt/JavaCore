import java.util.Scanner;

public class Name {

    String a, b, c;

    void input() {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        a = t.nextLine();
        System.out.print("Enter the middle name: ");
        b = t.nextLine();
        System.out.print("Enter the last name: ");
        c = t.nextLine();
    }

    void display() {
        System.out.println("Hello " + a + " " + b + " " + c);
    }
}
