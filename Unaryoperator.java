class Unaryoperator {
    public static void main(String[] args) {
        int x = 1;
        int y = x++;
        System.out.println("x value is " + x + " y value is " + y);
        int a = 0;
        int b = ++a;
        System.out.println("a value is " + a + " b value is " + b);
        int i = 2;
        int j = i--;
        System.out.println("i value is " + i + " j value is " + j);
        int p = 2;
        int q = --p;
        System.out.println("p value is " + p + " q value is " + q);
    }
}