package Solid_Principle.OpenClosedPrinciple.compliant;

public class FindShapeStats
{
    private Shape shape;

    public Double getArea()
    {
        return shape.getArea();
    }

    public Double getPerimeter()
    {
        // here as well instance of checks
        return shape.getPerimeter();
    }
}
