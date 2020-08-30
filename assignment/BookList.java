package assignment.pro192;
import java.util.*;
import java.io.*;

public class BookList {
    ArrayList<Book> t;

    public BookList() {
        t = new ArrayList<Book>();
    }
    boolean checkEmpty(){
        return(t.isEmpty());
    }
    void add(Book x) {
    t.add(x);  
    }
    //1
    void input() {
        Scanner ws = new Scanner(System.in);
        Book A;
        while(true){
            System.out.print("Enter code(=0 to Exit): ");
            String code = ws.nextLine();
            if("0".equals(code))break;
            System.out.print("Enter title: ");
            String title = ws.nextLine();
            System.out.print("Enter quantity: ");
            int quan = ws.nextInt();ws.nextLine();
            System.out.print("Enter price: ");
            double price = ws.nextDouble();ws.nextLine();
            A = new Book(code, title, quan, price);
            add(A);
        }
    }
    //2
    void display(){
        for(int i=0;i<t.size(); i++){
        System.out.print(t.get(i));
        System.out.println();
        }
    }
    //3
    int searchByCode (String xCode){
        int i,n; n=t.size(); Book x;
        for(i=0;i<n;i++) {
            x = t.get(i);
            if(x.code.equalsIgnoreCase(xCode)) return(i);
        }
        return(-1);
    }
    //4
    void update(String xCode,double xPrice){
        int place = searchByCode(xCode);
        t.get(place).setPrice(xPrice);
    }
    //5
    int max (){
        int i,n; n=t.size(); 
        Book x;
        Book y;
        int maxPlace = 0;
        if(n>=1){
            for(i=0;i<n-1;i++) {
                x = t.get(i);
                y = t.get(i+1);
                if(x.price>=y.price) maxPlace = i;
            }
        }
        return maxPlace;
    }
    //6***************************
    void sortByCode() {
        Comparator<Book> u = new Comparator<Book>() {
            public int compare(Book x, Book y) {
                return(x.code.compareTo(y.code));
            }
        };
        Collections.sort(t,u);
    }
    //7
    public void remove(String xCode) {
        int i =searchByCode(xCode);
        t.remove(i);
    }
    //8
    void loadFile(String fname) throws IOException {
    RandomAccessFile f = new RandomAccessFile(fname,"rw");
    String s; String [] a;
    String xCode, xTitle; int xQuan; double xcost;
        while(true) {
            s = f.readLine();
            if(s==null || s.trim().length()<3) break;
            a = s.split("[|]");
            xCode = a[0].trim();
            xTitle = a[1].trim();
            xQuan = Integer.parseInt(a[2].trim());
            xcost = Double.parseDouble(a[3].trim());
            add(new Book(xCode, xTitle, xQuan, xcost));
        }
    f.close();
    }
    //9
    void changeMax(){
        int place = max();
        t.get(place).setPrice(99);
    }
    void sortByqQantity() {
        Comparator<Book> u = new Comparator<Book>() {
            public int compare(Book x, Book y) {
                if(x.quantity > y.quantity)
                return(1);
                if(x.quantity == y.quantity)
                return(0);
                else
                return -1;
            }
        };
        Collections.sort(t,u);
    }
}
