package JavaTpoint.CreationalDesignPattern.BuilderPattern.RealWorldExample;

public class MediumNonVegPizza extends NonVegPizza
{
    @Override
    public float price()
    {
        return 200.0f;
    }

    @Override
    public String name()
    {
        return "Non-Veg Pizza";
    }

    @Override
    public String size()
    {
        return "Medium";
    }
}
