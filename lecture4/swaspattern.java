import java.util.Scanner;

class swaspattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   

        int mid = n / 2 + 1;

        int row = 1;
        while (row <= n) {

            int col = 1;
            while (col <= n) {

                if (row == mid || col == mid || 
                    (row == 1 && col <= mid) ||
                    (col == 1 && row >= mid) ||
                    (row == n && col >= mid) ||
                    (col == n && row <= mid)) {

                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }

                col++;
            }

            System.out.println();
            row++;
        }
    }
}
