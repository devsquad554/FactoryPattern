public class IciciPaymentFactory implements PaymentFactory {
    @Override
    public UpiPayment createUpiPayment() {
        return new IciciUpiPayment();
    }

    @Override
    public CardPayment createCardPayment() {
        return new IciciCardPayment();
    }
}
