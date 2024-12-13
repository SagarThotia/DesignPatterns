package JavaTpoint.CreationalDesignPattern.BuilderPattern.RealWorldExample;

public class LargePepsi extends Pepsi
{

    @Override
    public String name()
    {
        return "750 ml Pepsi";
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
