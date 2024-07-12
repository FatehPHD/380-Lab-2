public class Payment {
    private int paymentId;
    private double amount;
    private String type;
    private String details;

    // Constructors, getters, setters, and other methods
    public Payment(int paymentId, double amount, String type, String details) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.type = type;
        this.details = details;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
