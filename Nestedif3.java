class Nestedif3 {
    public static void main(String[] args) {
        System.out.println("programm started");
        String username = "Varun@12";
        String password = "Varun@0797";
        if (username == "Varun@12") {
            if (password == "Varun@0797") {
                System.out.println("login successfull");
            } else {
                System.out.println("invalid password");
            }
        } else {
            System.out.println("invalid userid");
        }

    }
}
