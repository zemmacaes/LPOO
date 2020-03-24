import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game
{
    private Screen screen;
    private TextGraphics graphics;

    private Arena arena;

    public Game()
    {
        try
        {
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            screen = new TerminalScreen(terminal);

            screen.setCursorPosition(null);   // we don't need a cursor
            screen.startScreen();             // screens must be started
            screen.doResizeIfNecessary();     // resize screen if necessary

        } catch (IOException e) {
            e.printStackTrace();
        }

        arena = new Arena(80, 24);

        graphics = screen.newTextGraphics();

    }

    private void draw() throws IOException
    {
        screen.clear();
        arena.draw(screen.newTextGraphics());
        screen.refresh();
    }

    private void processKey(KeyStroke key)
    {
        arena.processKey(key);
    }

    public void run()
    {
        try
        {
            while (true)
            {
                draw();
                KeyStroke key = screen.readInput();
                processKey(key);

                if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q')
                    screen.close();

                if (key.getKeyType() == KeyType.EOF)
                    break;
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
