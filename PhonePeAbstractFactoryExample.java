public class PhonePeAbstractFactoryExample {
    public static void main(String[] args) {
        // Create HDFC Payments
        PaymentFactory hdfcFactory = new HdfcPaymentFactory();
        UpiPayment hdfcUpi = hdfcFactory.createUpiPayment();
        CardPayment hdfcCard = hdfcFactory.createCardPayment();
        System.out.println("HDFC Payment: " + hdfcUpi.getUpiDetails() + ", " + hdfcCard.getCardDetails());

        // Create ICICI Payments
        PaymentFactory iciciFactory = new IciciPaymentFactory();
        UpiPayment iciciUpi = iciciFactory.createUpiPayment();
        CardPayment iciciCard = iciciFactory.createCardPayment();
        System.out.println("ICICI Payment: " + iciciUpi.getUpiDetails() + ", " + iciciCard.getCardDetails());
    }
}
