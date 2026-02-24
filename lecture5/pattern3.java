import java.util.*;
public class pattern3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1 ;
        
        while (row<=n){
            int i = 1 ;
            while(i<=star){
                System.out.print("*  ");
                i++;
            }
             
            System.out.println();
            row++;
            star ++;
        } 
             star = n-1;
            row = n - 1 ;
            while(row>=1){
                int j = 1 ;
                while(j<= star){
                    System.out.print("*  ");
                    j++;
                }
                 System.out.println();
                row--;
                star--;
            }
           
           
            
        }
    }
