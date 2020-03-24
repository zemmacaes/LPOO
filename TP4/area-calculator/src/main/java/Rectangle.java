public class Rectangle implements AreaShape
{
    private int width, height;

    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return height*width;
    }

    @Override
    public String draw() {
        return "Rectangle";
    }
}
