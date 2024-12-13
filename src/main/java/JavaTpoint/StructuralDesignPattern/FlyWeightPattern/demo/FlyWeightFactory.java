package JavaTpoint.StructuralDesignPattern.FlyWeightPattern.demo;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory
{
    private static final Map<String, Shape> flyweights = new HashMap<>();

    public static Shape getShape(String color)
    {
        Circle circle = (Circle) flyweights.get(color);

        if(circle == null)
        {
            circle = new Circle(color);
            flyweights.put(color, circle);
            System.out.println("Creating new Circle object with color: " + color);
        }
        return circle;
    }
}
