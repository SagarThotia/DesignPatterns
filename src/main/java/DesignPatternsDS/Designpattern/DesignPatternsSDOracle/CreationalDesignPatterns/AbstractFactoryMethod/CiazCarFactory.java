package Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.AbstractFactoryMethod;

public class CiazCarFactory extends MarutiCarFactory
{
    @Override
    public Car getCar() {
        return new Ciaz();
    }
}
