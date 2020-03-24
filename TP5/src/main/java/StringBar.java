import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar
{
    public StringBar()
    {
        super(new ArrayList<BarObserver>());
    }

    public StringBar(List<BarObserver> observers)
    {
        super(observers);
    }
}