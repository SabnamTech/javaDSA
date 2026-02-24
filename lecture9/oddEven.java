import java.util.*;
public class oddEven{
    public static String even(int  a ){
        if(a%2== 0){
           return "even";
        }else{
           return "odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = even(a);
        System.out.println(b);
    }
}