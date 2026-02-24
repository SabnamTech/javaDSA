
    
import java.util.*;
public class largest32{
    public static String max(int  a , int b , int c ){
        if(a>b && a>c){
           return " a is largest";
        }else if (b > c){
           return "b is largest";
        }else{
            return " c is largest";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b= sc.nextInt();
          int c = sc.nextInt();
        String d = max(a,b,c);

        
            System.out.println(d);
       
        
    }
}
