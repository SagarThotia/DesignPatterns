package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.FactoryMethod;

public class MarutiCarFactory
{
    public MarutiCarFactory() {
    }

    public Car getCar(CarType carType) {
        return switch (carType)
        {
            case SEDAN -> new Ciaz();
            case SUV -> new Breeza();
            case HATCHBACK -> new WagonR();
        };
    }
}
