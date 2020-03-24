public class Line implements Shape
{
    private int length;

    public Line (int length)
    {
        this.length = length;
    }

    @Override
    public String draw() {
        return "Line";
    }
}
