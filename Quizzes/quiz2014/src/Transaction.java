public abstract class Transaction {
    private double amount;
    private ATM atm;
    private Session s;
    private Card card;

    public Transaction(ATM atm, Session s, Card card, double amount) {
        this.amount = amount;
        this.atm = atm;
        this.s = s;
        this.card = card;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public ATM getAtm() {
        return atm;
    }

    public Session getS() {
        return s;
    }

    public Card getCard() {
        return card;
    }
}
