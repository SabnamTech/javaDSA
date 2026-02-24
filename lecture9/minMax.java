
    
import java.util.*;
public class minMax{
    public static int max(int  a , int b){
        if(a>b){
           return 1;
        }else{
           return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b= sc.nextInt();
        int c = max(a,b);

        if(c==1){
            System.out.println(a+" is largest");
        }else{
            System.out.println(b+" is largest");
        }
        
    }
}
