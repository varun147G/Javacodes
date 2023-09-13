class WhileLoopatm {

    public static void main(String[] args) {
        System.out.println("programm started");
        double acc_bal = 11999;
        double withdraw = 2000;
        while (acc_bal >= 2000) {
            System.out.println("withdraw amount is " + withdraw);
            acc_bal = (acc_bal - withdraw);
            System.out.println("acc_bal is " + acc_bal);
        }
        System.out.println("programm ended");
    }
}