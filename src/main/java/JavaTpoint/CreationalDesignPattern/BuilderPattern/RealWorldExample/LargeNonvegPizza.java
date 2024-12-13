package JavaTpoint.CreationalDesignPattern.BuilderPattern.RealWorldExample;

public class LargeNonvegPizza extends NonVegPizza
{
    @Override
    public float price()
    {
        return 220.0f;
    }

    @Override
    public String name()
    {
        return "Non-veg Pizza";
    }

    @Override
    public String size()
    {
        return "Large";
    }
}
