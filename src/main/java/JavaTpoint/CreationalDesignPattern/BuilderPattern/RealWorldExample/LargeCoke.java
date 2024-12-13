package JavaTpoint.CreationalDesignPattern.BuilderPattern.RealWorldExample;

public class LargeCoke extends Coke
{
    @Override
    public String name()
    {
        return "750 ml Coke";
    }

    @Override
    public String size()
    {
        return "Large";
    }

    @Override
    public float price()
    {
        return 50.0f;
    }
}
