import java.util.*;

public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a ");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter d ");
        int d = sc.nextInt();

        
        for(int i=0; i<10; i++){
            int Apseries = a + (i*d);
            System.out.print(Apseries+" ");
        }
        


    }
    
}
