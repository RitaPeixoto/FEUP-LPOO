import java.util.ArrayList;
import java.util.List;

public class Party extends Event{
    private List<Event> events = new ArrayList<>();
    public Party(String title, String date, String description){
        super(title,date,description);
    }
    public void addEvent(Event e){
        events.add(e);
        for(Person p : e.getPersonList()){
            super.addPerson(p);
        }
        //when we add an event we also need to add the people in the event
    }

}
