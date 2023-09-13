class Nestedif1 {
    public static void main(String[] args) {
        int a = 15, b = 20, c = 10;
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greatest number");
            } else {
                System.out.println(c + " is greatest number");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is greatest number");
            } else {
                System.out.println(c + " is greatest number");
            }
        }
    }

}
