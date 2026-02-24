import java.util.*;

class pattern16_upside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = n - 1;
        int space = 0;
        int row = 1;

        ArrayList<String> rows = new ArrayList<>();

        while (row <= n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= star; i++) sb.append("* ");
            for (int j = 1; j <= space; j++) sb.append("  ");
            if (row == n) {
                star--;
            }
            for (int k = 1; k <= star; k++) sb.append("* ");
            rows.add(sb.toString());

            space -= 2;
            star++;
            row++;
        }

        // print rows in reverse to get upside-down pattern
        for (int i = rows.size() - 1; i >= 0; i--) {
            System.out.println(rows.get(i));
        }
    }
}
