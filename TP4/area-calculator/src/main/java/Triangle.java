public class Triangle implements AreaShape
{
    private int base, height;

    public Triangle(int base, int height)
    {
        this.base = base;
        this. height = height;
    }


    @Override
    public double getArea()
    {
        return base*height/2;
    }

    @Override
    public String draw() {
        return "Triangle";
    }
}
