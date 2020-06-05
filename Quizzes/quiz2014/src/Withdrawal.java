public class Withdrawal extends Transaction{

    public Withdrawal(ATM atm, Session s, Card card, double amount) {
        super(atm, s, card, amount);
    }

    @Override
    public String toString() {
        return "Withdrawal at ATM "+ getAtm().getID() +" ("+getAtm().getCity() + ", " + getAtm().getBank() + ")"+ " of " + String.format("%.2f", getAmount()).replace(',', '.');
    }

}
