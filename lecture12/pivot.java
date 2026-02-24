import java.util.Scanner;
public class pivot{
    public static void find(int[] arr){
        int n = arr.length;
        for (int i = 1 ; i< n-2 ; i++){
            if (arr[i]> arr[i-1] && arr[i] > arr[i+1]){
                System.out.println(i);
            }
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        find(arr);
    }
}