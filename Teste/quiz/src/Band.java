import java.util.ArrayList;
import java.util.List;

public class Band extends Act
{
    private List<Artist> artists = new ArrayList<>();

    public Band(String name, String country)
    {
        super(name, country);
    }

    public void addArtist(Artist artist)
    {
        artists.add(artist);
    }

    public List<Artist> getArtists()
    {
        return artists;
    }

    public boolean containsArtist(Artist artist)
    {
        for (Artist a : artists)
            if (artist.equals(a))
                    return true;


        return false;
    }
}
