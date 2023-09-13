class Unary4 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++ + ++a;
        System.out.println("a value is " + a + " b value is " + b);
    }
}