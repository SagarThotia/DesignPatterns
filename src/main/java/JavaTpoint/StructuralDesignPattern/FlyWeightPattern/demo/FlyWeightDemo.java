package JavaTpoint.StructuralDesignPattern.FlyWeightPattern.demo;

public class FlyWeightDemo
{
    private static final String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};

    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            Circle circle = (Circle) FlyWeightFactory.getShape(getRandomColor());
            circle.setRadius(getRandomRadius());
            circle.draw(getRandomX(), getRandomY());
        }
    }

    private static String getRandomColor()
    {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomRadius()
    {
        return (int) (Math.random() * 100);
    }

    private static int getRandomX()
    {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY()
    {
        return (int) (Math.random() * 100);
    }
}
