public class pattern14 {
    public static void main(String[] args) {

        int n = 7;
        int i = 1;

        // Upper part
        while (i <= n) {
            int space = n - i;
            while (space >= 1) {
                System.out.print("  ");
                space--;
            }

            int star = 1;
            while (star <= i) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            i++;
        }

        // Lower part
        i = n - 1;
        while (i >= 1) {
            int space = n - i;
            while (space >= 1) {
                System.out.print("  ");
                space--;
            }

            int star = 1;
            while (star <= i) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            i--;
        }
    }
}