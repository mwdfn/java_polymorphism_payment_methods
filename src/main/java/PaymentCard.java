public abstract class PaymentCard {

    protected String cardNumber;
    protected String expiryDate;
    protected int securityNumber;

    public PaymentCard(String cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }
}
