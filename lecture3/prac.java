import java.util.*;

public class prac{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1= sc.nextInt();
        int x2 = sc.nextInt();
         int y1 = sc.nextInt();
          int y2= sc.nextInt();
        int m1 = (y2-y1)/(x2-x1);
        int m2 = (y2-y1)/(x2-x1);
        
        if (m1== m2 ){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
    
}
