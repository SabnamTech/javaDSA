import java.util.*;

public class lotery {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n  ");
    int n = sc.nextInt();

    if (n>=300 && n<=460){
        System.out.println("you won a Macbook");
    } 
    else if (n>=200 && n<=280){
        System.out.println("you won a kurkure");
    }
    else if (n>=1100 && n<=1500){
        System.out.println("you won a cycle");
    }
    else if( n>=50 && n<=80){
        System.out.println("you won a bike ");
    }
    else  {
        
        System.out.println("better luck next time");
    }

}
}
