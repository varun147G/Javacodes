public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                k = k + 2;
            }
            System.out.println();
        }
    }
}
