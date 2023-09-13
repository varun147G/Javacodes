class FunAddSqrsf {
    static void add() {
        System.out.println("addition started");
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.err.println(sum);
        System.out.println("addition ended");
    }

    static void sqr() {
        System.out.println("square started");
        int a = 10;
        int res = 10 * 10;
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
