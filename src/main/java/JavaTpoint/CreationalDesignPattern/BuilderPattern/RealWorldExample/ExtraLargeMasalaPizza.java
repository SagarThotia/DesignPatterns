package JavaTpoint.CreationalDesignPattern.BuilderPattern.RealWorldExample;

public class ExtraLargeMasalaPizza extends VegPizza
{
    @Override
    public float price()
    {
        return 180.0f;
    }

    @Override
    public String name()
    {
        return "Masala Pizza";
    }

    @Override
    public String size()
    {
        return "Extra Large";
    }
}