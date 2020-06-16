import java.util.ArrayList;
import java.util.List;

public class Event {
    private String title ="";
    private String date="";
    private String description="";
    private List<Person> personList = new ArrayList<>();

    public Event(Event e){
        this.title = e.getTitle();
        this.date = e.getDate();
        this.description = e.getDescription();
    }
    public Event(String title, String date, String description){
        this.title = title;
        this.date = date;
        this.description = description;
    }
    public Event(String title, String date){
        this.title = title;
        this.date = date;
    }

    public Event(String title){
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title){this.title = title;}
    public void setDate(String date){this.date = date;}
    public void setDescription(String description){this.description = description;}

    @Override
    public boolean equals(Object obj) {
        return (this.date == ((Event)obj).getDate()) && (this.description == ((Event)obj).getDescription()) && (this.title == ((Event)obj).getTitle());
    }

    public void addPerson(Person person){
        for(Person p: personList)
            if(p.getName() == person.getName())
                return;
        personList.add(person);
    }
    public int getAudienceCount(){

        return personList.size();
    }
    public List<Person> getPersonList(){
        return personList;
    }

    @Override
    public String toString() {
        return getTitle() + " is a " + getDescription() + " and will be held at " + getDate()+".";
    }
}
