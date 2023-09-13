import java.util.Scanner;

public class PrintPrimeNo {
    public static void print(int num) {
        // 538498481209731
        while (0 < num) {
            int count = 0;
            int rem = num % 10;
            for (int i = 2; i < rem; i++) {
                if (rem % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(rem);
                num = num / 10;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);
    }
}
