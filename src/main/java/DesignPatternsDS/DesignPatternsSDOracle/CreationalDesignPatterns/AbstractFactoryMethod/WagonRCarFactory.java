package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.AbstractFactoryMethod;

public class WagonRCarFactory extends MarutiCarFactory
{
    @Override
    public Car getCar() {
        return new WagonR();
    }
}
