import java.util.*;
public class third{
     public static void main(String[]args){
    //     for(int i = 1 ; i <= 5;i++){
    //         for(int j = 1 ; j <= i ; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1 ;
       
        while(row<=n){
            int i = n;
            while(i>=row){
                i--;
            System.out.print("* ");
        }
        System.out.println();
        row++;
    }
}
}