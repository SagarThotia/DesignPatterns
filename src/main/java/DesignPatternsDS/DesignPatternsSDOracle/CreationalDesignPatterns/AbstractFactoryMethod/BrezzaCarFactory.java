package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.AbstractFactoryMethod;

public class BrezzaCarFactory extends MarutiCarFactory
{
    @Override
    public Car getCar() {
        return new Breeza();
    }
}
