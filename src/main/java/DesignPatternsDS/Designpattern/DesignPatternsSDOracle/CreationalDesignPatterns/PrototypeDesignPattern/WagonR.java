package Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.PrototypeDesignPattern;

public class WagonR extends Car
{

    public WagonR(Car car) {
        super(car);
        System.out.println("Creating new WagonR instance using copy constructor"); // Logger
    }

    public WagonR()
    {
        super();
        System.out.println("Creating new WagonR instance using default constructor."); // Logger
    }

    @Override
    public int getEngineCC() {
        return 1200;
    }

    @Override
    public int getPrice() {
        return 500000;
    }

//    @Override
    public Car getClone(Car car) {
        return new WagonR(car); // Copy constructor wagonR will be called.
    }
}
