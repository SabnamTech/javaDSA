import java.util.*;
public class SI1{
    public static void simple(int p ,  int r , int t  ){
        int si = p*r*t/100;
        System.out.println(si);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        simple(p , r , t );
    }
}