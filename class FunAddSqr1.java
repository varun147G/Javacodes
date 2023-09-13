class FunAddSqr1 {
    static void add() {
        System.out.println("addition started");
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);
        System.out.println("addition ended");
    }

    static void sqr() {
        System.out.println("square started");
        int a = 5;
        int res = a * a;
        System.out.println(res);
        System.out.println("square ended");
    }

    public static void main(String[] args) {
        System.out.println("main started");
        add();
        sqr();
        System.out.println("main ended");
    }
}
