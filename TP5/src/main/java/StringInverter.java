public class StringInverter implements StringTransformer
{
    @Override
    public void execute(StringDrink drink)
    {
        StringBuffer buf = new StringBuffer(drink.getText());

        buf.reverse();

        drink.setText(buf.toString());
    }
}
