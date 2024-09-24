public class SubscriptionFactory {

    // Default method
    public static Subscription createSubscription() {
        return new BasicPlan();
    }

    // Overloaded with plan argument
    public static Subscription createSubscription(String plan) {
        switch (plan) {
            case "Basic":
                return new BasicPlan();
            case "Standard":
                return new StandardPlan();
            case "Premium":
                return new PremiumPlan();
            default:
                throw new IllegalArgumentException("Unknown plan.");
        }
    }

    // Overloaded with multiple arguments
    public static Subscription createSubscription(String plan, boolean multiScreen) {
        if (plan.equals("Standard") && multiScreen) {
            return new PremiumPlan();
        }
        return createSubscription(plan);
    }
}
