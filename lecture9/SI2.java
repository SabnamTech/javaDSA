
    
import java.util.*;
public class SI2{
    public static int max(int  p , int r , int t ){
        int si = p*r*t/100;
        return si;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
         int r= sc.nextInt();
          int t = sc.nextInt();
        int d = max(p , r ,t);

        
            System.out.println(d);
       
        
    }
}
