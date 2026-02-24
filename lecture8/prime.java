import java.util.Scanner;
public class prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = 1;
        for(int i = 2 ; i<n; i++){
            if(n%2 == 0){
                prime = 0;
                break;
            }
        }
        if(prime == 1 ){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    
}