class FunSqrwpwr {
    static int sqr(int a) {
        System.out.println("square started");
        int res = a * a;
        return res;
    }

    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println(sqr(5));
        System.out.println(sqr(10));
        System.out.println("main ended");
    }
}
