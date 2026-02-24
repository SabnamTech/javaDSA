import java.util.*;
public class arr5 {
    public static void  leftshift(int[] arr){
        int i = 0;
        int j =  1;
        while  (j<arr.length){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0 ; i< 5 ; i++){
            arr[i] = sc.nextInt();
        }
        leftshift(arr);
        for(int i = 0 ; i< 5 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
