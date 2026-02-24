class fourteen {
    public static void main(String[] args) {

        int n = 5;
        int row = 1;

        while (row <= n) {

            int num = n;
            int count = 1;

            while (count <= n) {

                if (count == n - row + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(num + " ");
                }

                num--;
                count++;
            }

            System.out.println();
            row++;
        }
    }
}
