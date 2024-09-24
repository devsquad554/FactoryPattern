public class HDFCFactoryExample {
    public static void main(String[] args) {
        Account savings = AccountFactory.createAccount("Savings");
        System.out.println("Created Account: " + savings.getAccountType());

        Account current = AccountFactory.createAccount("Current");
        System.out.println("Created Account: " + current.getAccountType());
    }
}
