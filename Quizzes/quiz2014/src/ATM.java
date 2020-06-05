import java.util.Objects;

public class ATM {
    private int id;
    private String city;
    private String bank;

    public ATM(int id, String city, String bank){
        this.id = id;
        this.city = city;
        this.bank = bank;
    }

    public int getID() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return id == atm.id &&
                Objects.equals(city, atm.city) &&
                Objects.equals(bank, atm.bank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, bank);
    }
}
