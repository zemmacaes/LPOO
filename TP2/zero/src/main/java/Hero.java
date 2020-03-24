import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

public class Hero extends Element
{
    public Hero(int x, int y)
    {
        super(x, y);
    }

    public Position getPosition()
    {
        return position;
    }

    public void setPosition(Position position)
    {
        this.position = position;
    }

    public Position moveUp()
    {
        return new Position(position.getX(), position.getY() - 1);
    }

    public Position moveDown()
    {
        return new Position(position.getX(), position.getY() + 1);
    }

    public Position moveLeft()
    {
        return new Position(position.getX() - 1, position.getY());
    }

    public Position moveRight()
    {
        return new Position(position.getX() + 1, position.getY());
    }

    public void draw(TextGraphics graphics)
    {
        graphics.setForegroundColor(TextColor.Factory.fromString("#33FF33"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "X");
    }
}
