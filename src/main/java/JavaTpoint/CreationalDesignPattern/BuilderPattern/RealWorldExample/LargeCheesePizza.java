package JavaTpoint.CreationalDesignPattern.BuilderPattern.RealWorldExample;

public class LargeCheesePizza extends VegPizza
{

    @Override
    public float price()
    {
        return 260.0f;
    }

    @Override
    public String name()
    {
        return "Cheese Pizza";
    }

    @Override
    public String size()
    {
        return "Large";
    }
}
