class FunChainwopwor {
    static void prod() { // without parameter and without return type
        System.out.println("product started");
        int a = 5;
        int b = 10;
        int c = 15;
        int res = a * b * c;
        System.out.println(res);
        fact();
        System.out.println("product ended");
    }

    static void fact() {
        System.out.println("fact started");
        sum();
        int fact = 1;
        int n = 6;
        for (int i = 1; i <= 6; i++) {
            fact *= i;
        }
        System.out.println(fact);
        System.out.println("fact ended");
    }

    static void sum() {
        System.out.println("sum started");
        int sum = 0;
        int n = 7;
        for (int i = 1; i <= 7; i++) {
            sum + = i;
        }
        System.out.println(sum);
        System.out.println("sum ended");
    }

    public static void main(String[] args) {
        System.out.println("main started");
        prod();
        System.out.println("main ended");
    }
}
