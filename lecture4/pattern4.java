import java.util.*;

public class pattern4 {
    public static void main (String[]args) {
        //for (int i = 1 ; i <= 5; i++){
            //for(int j = 1 ; j<=5 ; j++){
                // System.out.print( "*");
           // }
           // System.out.println();
        //}
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int space = n - 1;
    
    int star = 1;
    int row = 1 ;
    while(row<=n){
        int i = 1 ;
        while(i<=space){
            System.out.print("  ");
            i++;
        }
        int j = 1 ;
        while(j<=star){
            System.out.print("* ");
            j++;
        }
        System.out.println();
        space--;
        star++;
        row++;
    }
    }
}
