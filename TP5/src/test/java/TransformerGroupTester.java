import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TransformerGroupTester
{
    @Test
    public void transformerGroup() {
        StringDrink drink = new StringDrink( "AbCd-aBcD");

        StringInverter si = new StringInverter();
        StringCaseChanger cc = new StringCaseChanger();

        List<StringTransformer> transformers = new ArrayList<>();
        transformers.add(si);
        transformers.add(cc);

        StringTransformerGroup tg = new StringTransformerGroup(transformers);
        tg.execute(drink);

        assertEquals("dCbA-DcBa", drink.getText());
    }

}
