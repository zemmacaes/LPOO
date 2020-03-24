public class StringReplacer implements StringTransformer
{
    private char a, b;

    public StringReplacer(char a, char b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute(StringDrink drink)
    {
        String text = drink.getText();

        drink.setText(text.replace(a, b));
    }
}
