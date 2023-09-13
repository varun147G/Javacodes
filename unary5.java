class unary5 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ - --x - x-- + x++ + --x + ++x + x-- + x--;
        System.out.println("x value is " + x + " y value is " + y);
    }
}