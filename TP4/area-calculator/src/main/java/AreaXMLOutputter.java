public class AreaXMLOutputter
{
    SumProvider s;

    public AreaXMLOutputter(SumProvider s)
    {
        this.s = s;
    }

    public String output() {
        return "<area>" + s.sum() + "</area>";
    }
}
