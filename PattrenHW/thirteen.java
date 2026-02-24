import java.util.Scanner;

class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = n;
        int space = 0;

        // upper part
        while (row <= n) {

            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }

            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            space += 2;
            star--;
            row++;
        }

        // lower part
        row = n - 1;
        star = 2;
        space -= 4;

        while (row >= 1) {

            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }

            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            space -= 2;
            star++;
            row--;
        }
    }
}
