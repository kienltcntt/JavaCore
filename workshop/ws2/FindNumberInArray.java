import java.util.*;

public class FindNumberInArray {
    int n = 10;
    int []a ={7,9,5,1,3,8,6,11,4,2};
    int []b ={7,9,5,1,3,8,6,11,4,2};

    
    void display(){
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
       
    void sapxep(){
        int tmp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    tmp=a[j];
                  a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"   ");            
        }       
    }
    
        void sapxep6sodau(){
        int tmp;
        for(int i=0;i<6;i++){
            for(int j=0;j<6-1;j++){
                if(b[j]>b[j+1]){
                    tmp=b[j];
                  b[j]=b[j+1];
                    b[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<6;i++){
            System.out.print(b[i]+"   ");
        }
        for(int i=6;i<n;i++){
            System.out.print(b[i]+"   ");
        }
    }
    
    void min(){
        int temp = a[0];
        int bfor = 0;
        System.out.print("\nMin  = ");
        for(int i=1; i<n; i++){
            if(temp > a[i]){
                temp = a[i];
            }
        }
        System.out.println(temp);
        for(int i=0; i<n; i++){
            if(temp == a[i]){
                bfor = a[i-1];               
            }
        }
        System.out.print("Befor min = " + bfor);
        System.out.println();
    }
}