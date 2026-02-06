import java.util.*;

public class pattern3 {
    public static void main (String[]args) {
        //for (int i = 1 ; i <= 5; i++){
            //for(int j = 1 ; j>=i ; j--){
                // System.out.print( "*");
           // }
           // System.out.println();
        //}
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int row = 1;
    while(row<=i){
        int j = i ;
        while(j>=row){
            System.out.print("*");
            j--;
        }
        System.out.println();
        row++;
    }
    }
}
