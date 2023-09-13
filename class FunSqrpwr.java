class FunSqrpwr {
    static int sqr() {
        System.out.println("sqr started");
        int a = 5;
        int res = a * a;
        return res;
    }

    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println(sqr());
        System.out.println("main ended");
    }
}
