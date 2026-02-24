import java.util.Scanner;
public class allPrime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =1;
        for(int i = 1 ; i<=100; i++){
            for(int j = 2 ; j<i; j++){
                if(i%j == 0){
                    n = 0;
                    break;
                }
            }
            if(n == 1){
                System.out.println(i);
            }
            n = 1;
        }
        
        }
        
    }
    
