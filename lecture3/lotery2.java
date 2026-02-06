import java.util.*;

public class lotery2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n  ");
    int n = sc.nextInt();

    if (n>=300 && n<=460){
        System.out.println("you won a Macbook");
    
      if(n>=300 && n<=380){
        System.out.println("you won M1 mac");
    }
       else if(n>=381 && n<=460){
        System.out.println("you won M2 mac");
    }
}
    else if (n>=200 && n<=280){
        System.out.println("you won a kurkure");
    
     if( n>=251 && n<=240){
        System.out.println("you won a chilli kurkure");
    }
    else if(n>=241 && n<=280){
        System.out.println("you won a onion kurkure");
    }
    }

    else if (n>=1100 && n<=1500){
        System.out.println("you won a cycle");
    
     if(n>=1100 && n<=1300){
        System.out.println("you won a  evon cycle");
    }
    else if(n>=1301 && n<=1500){
        System.out.println("you won a hero cycle");
    }
}
    else if( n>=50 && n<=80){
        System.out.println("you won a bike ");
    
     if(n>=50 && n<=65){
        System.out.println("you won a bullet");
    }
    else if(n>=66 && n<=80){
        System.out.println("you won a raajdoot");
    }
    }
    else  {
        
        System.out.println("better luck next time");
    }
    }
}
