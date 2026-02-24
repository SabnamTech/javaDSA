import java.util.Scanner;

public class Main {

    
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            // size of array
        int[] arr = new int[5];    
        // taking input
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // calling void function
        printArray(arr);
    }
}
