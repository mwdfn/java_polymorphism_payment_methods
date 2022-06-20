public class DebitCard extends  PaymentCard implements IScan{
    private int sortCode;
    private int accountNumber;

    public DebitCard(String cardNumber, String expiryDate, int securityNumber, int sortCode, int accountNumber) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public String scan() {
        return "Payment Complete";
    }
}
