import java.util.ArrayList;
import java.util.List;

public static class BoxOffice {
    private static List<Concert> concertList = new ArrayList<>();
    public static int getTicketNumber(Concert concert){
        int res=0;
        for(Concert concert1: concertList)
            if (concert1.equals(concert))
                res++;
        return res;
    }
    public static List<Ticket> buy(Concert concert, int amount) throws InvalidTicket {
        int number;
        List<Ticket> tickets = new ArrayList<>();
        for(int i=0; i<amount; i++){
            concertList.add(concert);
            number = getTicketNumber(concert);
            Ticket ticket = new Ticket(number, concert);
            tickets.add(ticket);
        }

        return tickets;
    }
}
