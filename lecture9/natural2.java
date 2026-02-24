
    
import java.util.*;
public class natural2{
    public static int natural(int n ){
        
            return n * (n + 1 )/2;
           
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int d = natural(n);

        
            System.out.println(d);
       
        
    }
}
