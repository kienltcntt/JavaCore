import java.util.Scanner;
public class Main {

    public static void main(String[] args) {       
        Scanner t = new Scanner(System.in);
        
        Time y = new Time();
        y.input();
        y.display();
        System.out.println();
        
        Name x = new Name();
        x.input();
        x.display();
        System.out.println();
               
    }
}
