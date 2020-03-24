public class AreaStringOutputter
{
    SumProvider s;

    public AreaStringOutputter(SumProvider s)
    {
        this.s = s;
    }

    public String output() {
        return "Sum of areas: " + s.sum();
    }
}
