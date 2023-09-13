class FunChainwpwor {
    static void prod(int a, int b, int c) { // with parameter and without return type
        System.out.println("product started");
        int res = a * b * c;
        System.out.println(res);
        sum(0, 7);
        System.out.println("product ended");
    }

    static void fact(int n, int fact) {
        System.out.println("fact started");
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
        prod(5, 10, 20);
        System.out.println("fact ended");
    }

    static void sum(int sum, int n) {
        System.out.println("sum started");
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println("sum ended");
    }

    public static void main(String[] args) {
        System.out.println("main started");
        fact(6, 1);
        System.out.println("main ended");
    }
}
