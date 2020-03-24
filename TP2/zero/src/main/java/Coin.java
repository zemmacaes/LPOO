import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Coin extends  Element
{
    public Coin(int x, int y)
    {
        super(x, y);
    }

    @Override
    public void draw(TextGraphics graphics)
    {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#33FF33"));
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "O");
    }
}
