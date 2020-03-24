public class StringCaseChanger implements StringTransformer
{
    @Override
    public void execute(StringDrink drink)
    {
        String text = drink.getText();

        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            if (Character.isLowerCase(chars[i]))
                Character.toUpperCase(chars[i]);

            else
                Character.toLowerCase(chars[i]);
        }

        drink.setText(chars.toString());
    }
}
