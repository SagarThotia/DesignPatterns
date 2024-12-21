package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.FactoryMethod;

public class Test
{
    public static void main(String[] args)
    {
        CarType testCar = CarType.SEDAN;
        MarutiCarFactory marutiCarFactory = new MarutiCarFactory();
        Car car = marutiCarFactory.getCar(testCar); // Car = Abstract instance not absolute Car
        System.out.println("Car " + car.getClass().getName() +
                   " has " + car.getEngineCC() +
                   " with price " + car.getPrice());
    }
}
