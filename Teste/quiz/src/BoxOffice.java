import java.util.*;

public class BoxOffice
{
    static List<Ticket> totalTickets = new ArrayList<>();

    public BoxOffice() {}

    public static int getTotal(Concert concert)
    {
        int total = 0;

        for (Ticket ticket : totalTickets)
            if (ticket.getConcert().equals(concert))
                total++;

        return total;
    }

    public static List<Ticket> buy(Concert concert, int n) throws InvalidTicket
    {
        List<Ticket> tickets = new ArrayList<>();

        int total = getTotal(concert);

        for (int i = 1; i <= n; i++)
        {
            Ticket t = new Ticket(i+total, concert);

            totalTickets.add(t);
            tickets.add(t);
        }

        return tickets;
    }
}
