import java.util.*;

public class Time {
    int hour,minute,last;
   
    void input(){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter start hour: ");
        hour = t.nextInt(); t.nextLine();
        System.out.print("Enter start minutes: ");
        minute = t.nextInt(); t.nextLine();
        System.out.print("Enter last minutes: ");
        last = t.nextInt(); t.nextLine();
    }
    int Hour(){
        return( (hour*60 + minute + last) / 60);
    }
    int Minute(){
        return( (minute + last) % 60);
}
    void display(){
        if( Hour() < 24 ){
            System.out.println("Starts at " + hour + " " + minute + " and lasts " + last + " minutes \nIt will end at " + Hour() + " " + Minute() );
        }
        else{
            System.out.println("Starts at " + hour + " " + minute + " and lasts " + last + " minutes \nIt will end at " + ( Hour() %24 )+ " " + Minute() );
        }   
    }
}



