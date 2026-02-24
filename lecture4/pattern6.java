import java.util.*;

public class pattern6 {
    public static void main (String[]args) {
        //for (int i = 1 ; i <= 5; i++){
            //for(int j = 1 ; j<=5 ; j++){
                // System.out.print( "*");
           // }
           // System.out.println();
        //}
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int space = (n-1)*2;
    int star = n;
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
        space -= 2;
        star--;
        row++;
    }

    // mirrored (downside) triangle: increasing stars from 2..n, spaces increasing
    int space2 = 2;
    int star2 = 2;
    int row2 = 2;
    while (row2 <= n) {
        int a = 1;
        while (a <= space2) {
            System.out.print("  ");
            a++;
        }
        int b = 1;
        while (b <= star2) {
            System.out.print("* ");
            b++;
        }
        System.out.println();
        space2 += 2;
        star2++;
        row2++;
    }
    }
}
