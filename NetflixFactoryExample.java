public class NetflixFactoryExample {
    public static void main(String[] args) {
        Subscription basic = SubscriptionFactory.createSubscription();
        System.out.println("Created Subscription: " + basic.getSubscriptionPlan());

        Subscription standard = SubscriptionFactory.createSubscription("Standard");
        System.out.println("Created Subscription: " + standard.getSubscriptionPlan());

        Subscription premium = SubscriptionFactory.createSubscription("Standard", true);
        System.out.println("Created Subscription: " + premium.getSubscriptionPlan());
    }
}
