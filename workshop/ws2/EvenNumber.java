import java.util.Scanner;
public class EvenNumber {
    int a,b;

    void input(){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the a: ");
        a = t.nextInt();t.nextLine();
        System.out.print("Enter the b: ");
        b = t.nextInt();t.nextLine();        
    }
    
    void display(){
        for (int i = a; i <= b; i++) {
            if (i%2==0) {
                System.out.print(i + " ");                
            }
        }
        System.out.println();
    }
}