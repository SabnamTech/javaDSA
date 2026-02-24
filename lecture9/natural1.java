import java.util.*;
public class natural1{
    public static void even(int  n ){
        if(n >= 0){
            int sum = n * (n + 1) / 2;
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        even(n);
    }
}