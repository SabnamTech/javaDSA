import java.util.Scanner;

class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = n;
        int space = 0;
        int row = 1;

        while (row <= n) {

            // left stars
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            // middle spaces
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            // right stars (same count)
            int k = 1;
            while (k <= star) {
                System.out.print("* ");
                k++;
            }

            System.out.println();
            star--;
            space += 2;
            row++;
        }
    }
}
