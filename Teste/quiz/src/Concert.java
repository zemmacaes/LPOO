import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert
{
    private String city, country, date;
    private List<Act> acts = new ArrayList<>();

    public Concert(String city, String country, String date)
    {
        this.city = city;
        this.country = country;
        this.date = date;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public void addAct(Act act)
    {
         acts.add(act);
    }

    public List<Act> getActs()
    {
        return acts;
    }

    public boolean participates(Artist artist)
    {
        for (Act act : acts)
        {
            if (act.getClass() == Artist.class && artist.equals(act))
                return true;

            else if (act.getClass() == Band.class)
            {
                Band b = (Band) act;

                if (b.containsArtist(artist))
                    return true;
            }
        }

        return false;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;

        if (o == null)
            return false;

        if (this.getClass() != o.getClass())
            return false;

        Concert c = (Concert) o;

        return this.city.equals(c.city) && this.country.equals(c.country) && this.date.equals(c.date);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(city, country, date);
    }

    public boolean isValid(Ticket ticket)
    {
        return this.equals(ticket.getConcert());
    }
}
