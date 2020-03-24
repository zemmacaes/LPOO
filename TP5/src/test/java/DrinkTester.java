import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTester
{
    @Test
    public void stringDrink() {
        StringDrink drink = new StringDrink("ABCD");
        assertEquals("ABCD", drink.getText());
        drink.setText("DCBA");
        assertEquals("DCBA", drink.getText());
    }

}
