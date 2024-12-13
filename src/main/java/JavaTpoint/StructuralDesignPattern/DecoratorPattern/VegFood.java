package JavaTpoint.StructuralDesignPattern.DecoratorPattern;

public class VegFood implements Food
{

    @Override
    public String prepareFood()
    {
        return "VegFood";
    }

    @Override
    public double foodPrice()
    {
        return 50.0;
    }
}
