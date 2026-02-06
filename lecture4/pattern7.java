import java.util.*;

public class pattern7 {
    public static void main (String[]args) {
        int n = 5;
        for (int i = 1 ; i <= n; i++){
            for(int j = 1 ; j<=n ; j++){
                if (i == 1 || j== 1  || i == n || j == n){
                    
                    System.out.print("*");
                 
           }else{
                    System.out.print(" ");
                }
           }
            System.out.println();
        }
    
    //int i = 5;
    //int row = 1;
    //while(row <= i){
      //  int j = 1;
        //while(j <= i){
          //  if(row == 1 || row == i || j == 1 || j == i){
            //    System.out.print("*");
            //}
            //else{
                System.out.print(" ");
           // }
            //j++;
       // }
        //System.out.println();
        //row++;
    //}
    }
}
