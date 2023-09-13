class fact {
    public static void main(String[] args) {
        int fact = 1;
        int n = 6;
        for (int i = 1; i <= 6; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
