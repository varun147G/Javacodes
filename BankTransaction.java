class BankTransaction {
    public static void main(String[] args) {
        // System.out.println("programm started");

        double balance = 10000;
        double n = 100000;
        double m = 150000;

        System.out.println("account balance is " + balance);
        if (n < balance) {
            System.out.println();
        } else {
            System.out.println("insuffient fund");
            System.out.println("withdrawn amount is " + n);
            balance = balance - n;
            System.out.println("available balance is " + balance);
            System.out.println("deposite amount is " + m);
            balance = balance + m;
            System.out.println("available balance is " + balance);
            // System.out.println("programm ended");
        }
    }
}