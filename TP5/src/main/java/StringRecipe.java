import java.util.List;

public class StringRecipe
{
    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers)
    {
        this.transformers = transformers;
    }

    public StringDrink mix(StringDrink drink)
    {
        for(StringTransformer transformer : transformers)
            transformer.execute(drink);

        return drink;
    }
}
