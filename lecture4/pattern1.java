import java.util.*;

public class pattern1 {
    public static void main (String[]args) {
        //for (int i = 1 ; i <= 5; i++){
            //for(int j = 1 ; j<=5 ; j++){
                // System.out.print( "*");
           // }
           // System.out.println();
        //}
    
    int i = 5;
    int row = 1;
    while(row<=i){
        int j = 1 ;
        while(j<=i){
            System.out.print("*");
            j++;
        }
        System.out.println();
        row++;
    }
    }
}
