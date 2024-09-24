public interface PaymentFactory {
    UpiPayment createUpiPayment();
    CardPayment createCardPayment();
}
