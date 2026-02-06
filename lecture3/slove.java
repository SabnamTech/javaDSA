

import java.util.*;

public class slove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1  ");
        int x1 = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter y1  ");
        int y1 = sc.nextInt();
        

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter x2  ");
        int x2 = sc.nextInt();

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter y2  ");
        int y2 = sc.nextInt();

        int m1 = (y2 - y1)/(x2 - x1);
        int m2 = (y2 - y1)/(x2 - x1);

        if (m1 == m2) {
            System.out.println("it is a straight line");
        } else {
            System.out.println("it is not a straight line");
        }

       
    }
}

