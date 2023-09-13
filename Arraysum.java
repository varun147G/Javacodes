class Arraysum {
    public static void main(String[] args) {
        int[] a = { 4, 8, 12, 16, 75, 88 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
