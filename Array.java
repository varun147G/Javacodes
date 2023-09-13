class Array {
    public static void main(String[] args) {
        System.out.println("programm started");
        int[] a = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
        System.out.println("programm ended");
    }
}