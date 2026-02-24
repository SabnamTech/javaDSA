import java.util.*;

public class prac {
    public static void find(int[] arr){
        int i = arr.length - 1;
        int j = i  - 1;
        while(j >= 0){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i--;
            j--;
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = sc.nextInt();
        }
        
        find(arr);
        for(int i = 0 ; i < 5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

