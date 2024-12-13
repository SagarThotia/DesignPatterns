package JavaTpoint.CreationalDesignPattern.BuilderPattern.RealWorldExample;

public class SmallPepsi extends Pepsi
{
    @Override
    public String name()
    {
        return "300 ml Pepsi";
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
