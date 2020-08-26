import java.util.*;
public class Main {
    public static boolean isSubAnag(String u,String v) {
        int n,i; 
        char c;
        n = u.length();
        for(i=0;i<n;i++) {
            c = u.charAt(i);
            if(v.indexOf(""+c)==-1) return(false);
        }
        return(true);
    }
    
    public static boolean isAnag(String u,String v) {
    if (u.length() != v.length()) {
        return false;
    }
    char[] a1 = u.toCharArray();
    char[] a2 = v.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
}
 

    public static void main(String[] args) {
        String x = "ABCBDE";
        String y = "ACBDBE";
        String z = "ACBDE";

        System.out.println("(1)y is anagram of x?" + isAnag(y,x));
        System.out.println("(2)z is anagram of x?" + isAnag(z,x));
        System.out.println("(3)z is sub-anagram of x?" + isSubAnag(z,x));
    }
}
