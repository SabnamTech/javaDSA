import java.util.*;
public class pattern1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1 ;
        
        while (row<=n){
            int i = 1 ;
            while(i<=n){
                if( row == i || row + i == n +1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                i++;
            }
            System.out.println();
            row++;
            
        }
    }
}