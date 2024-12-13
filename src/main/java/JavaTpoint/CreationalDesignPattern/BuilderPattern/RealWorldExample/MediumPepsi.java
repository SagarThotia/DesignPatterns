package JavaTpoint.CreationalDesignPattern.BuilderPattern.RealWorldExample;

public class MediumPepsi extends Pepsi
{
    @Override
    public String name()
    {
        return "500 ml Pepsi";
    }

    @Override
    public String size()
    {
        return "Medium";
    }

    @Override
    public float price()
    {
        return 35.0f;
    }
}
