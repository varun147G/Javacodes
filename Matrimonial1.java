class Matrimonial1 {
    public static void main(String[] args) {
        System.out.println("programm started");
        int age = 21;
        char gender = 'm';
        String username = "Varun@12";
        String password = "Varun@0797";
        if (age == 21) {
            if (gender == 'm') {
                if (username == "Varun@12") {
                    if (password == "Varun@0797") {
                        System.out.println("login successful");
                    } else {
                        System.out.println("invalid password");
                    }
                } else {
                    System.out.println("invalid gender");
                }
            } else {
                System.out.println("invalid age");
            }
        } else {
            System.out.println("invalid userid");
        }

    }
}
