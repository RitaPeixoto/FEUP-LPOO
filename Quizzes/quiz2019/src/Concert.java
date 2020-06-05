import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {
    private String city;
    private String country;
    private String date;
    private List<Act> acts;
    public Concert(String city, String country, String date){
        this.city = city;
        this.country = country;
        this.date = date;
        this.acts = new ArrayList<>();
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }

    public List<Act> getActs() {
        return acts;
    }
    public void addAct(Act act){
        this.acts.add(act);
    }

    @Override
    public boolean equals(Object obj) {
        return(this.city == ((Concert)obj).getCity()) && (this.country == ((Concert)obj).getCountry()) && (this.date == ((Concert)obj).getDate());
    }

    public boolean isValid(Ticket ticket){
        if(ticket.getConcert() == this) return true;
        return false;
    }
    public boolean participates(Artist artist){
        for(Act a : acts){
            if(a instanceof Artist){
                if(a.equals(artist)) return true;
            }
            else if (a instanceof Band){
                if(((Band) a).containsArtist(artist)) return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }
}
