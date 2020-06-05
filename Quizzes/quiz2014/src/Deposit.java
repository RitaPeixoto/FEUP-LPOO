
public class Deposit extends Transaction{
    public Deposit(ATM atm, Session s, Card card, double amount) {
        super(atm, s, card, amount);
    }
}
