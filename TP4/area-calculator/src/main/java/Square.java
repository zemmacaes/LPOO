public class Square implements Shape, HasArea
{
    private int side;

    public Square(int side)
    {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return Math.pow(side, 2);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String draw() {
        return "Square";
    }
}
