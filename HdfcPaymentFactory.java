public class HdfcPaymentFactory implements PaymentFactory {
    @Override
    public UpiPayment createUpiPayment() {
        return new HdfcUpiPayment();
    }

    @Override
    public CardPayment createCardPayment() {
        return new HdfcCardPayment();
    }
}
