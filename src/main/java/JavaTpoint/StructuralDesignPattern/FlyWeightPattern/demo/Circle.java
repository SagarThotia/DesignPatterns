package JavaTpoint.StructuralDesignPattern.FlyWeightPattern.demo;

public class Circle implements Shape
{
    private String color;
    private int radius;

    public Circle(String color)
    {
        this.color = color;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw(int x, int y)
    {
        System.out.println("Drawing circle [Color: " + color + ", Radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
