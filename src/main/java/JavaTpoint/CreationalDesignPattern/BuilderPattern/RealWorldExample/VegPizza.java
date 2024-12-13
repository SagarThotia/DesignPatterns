package JavaTpoint.CreationalDesignPattern.BuilderPattern.RealWorldExample;

public abstract class VegPizza extends Pizza
{
    @Override
    public abstract float price();

    @Override
    public abstract String name();

    @Override
    public abstract String size();
}
