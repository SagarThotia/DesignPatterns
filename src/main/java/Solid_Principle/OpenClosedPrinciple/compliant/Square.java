package Solid_Principle.OpenClosedPrinciple.compliant;

public class Square implements Shape
{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public Double getArea() {
        return side * side * 1.d;
    }

    @Override
    public Double getPerimeter() {
        return 4.d * side;
    }
}
