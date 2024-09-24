public class AccountFactory {
    public static Account createAccount(String type) {
        switch (type) {
            case "Savings":
                return new SavingsAccount();
            case "Current":
                return new CurrentAccount();
            default:
                throw new IllegalArgumentException("Unknown account type.");
        }
    }
}
