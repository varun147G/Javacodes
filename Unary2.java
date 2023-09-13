class Unary2 {
    public static void main(String[] args) {
        int a = 2;
        int b = ++a;
        System.out.println("a value is " + a + " and b value is " + b);
        int c = 1;
        int d = a++;
        System.out.println("c value is " + c + " and d value is " + d);
    }
}