import java.util.*;
public class first{
    public static void main(String[]args){
        // for(int i = 1 ; i <= 5;i++){
        //     for(int j = 1 ; j <= 6 ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1 ;
        while(row<=n){
            int i = 1;
            while(i<=n){
                i++;
            System.out.print("* ");
        }
        System.out.println();
        row++;
    }
}
}