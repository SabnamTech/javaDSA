import java.util.Scanner;

class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n - 1;
        int num = 1;

        while (row <= n) {

          
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

         
            int j = 1;
            while (j <= 2 * row - 1) {
                System.out.print(num + " ");
                num++;
                j++;
            }

            System.out.println();
            row++;
            space--;
        }
    }
}
