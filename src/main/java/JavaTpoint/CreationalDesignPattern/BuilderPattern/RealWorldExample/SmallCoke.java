package JavaTpoint.CreationalDesignPattern.BuilderPattern.RealWorldExample;

public class SmallCoke extends Coke
{
    @Override
    public String name()
    {
        return "300 ml Coke";
    }

    @Override
    public String size()
    {
        return "Small";
    }

    @Override
    public float price()
    {
        return 25.0f;
    }
}
