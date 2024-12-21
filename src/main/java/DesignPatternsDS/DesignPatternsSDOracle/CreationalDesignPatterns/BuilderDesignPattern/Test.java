package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.BuilderDesignPattern;

public class Test
{
    public static void main(String[] args)
    {
        // Method Chaining
        Car.CarBuilder carBuilder2024 = new Car.CarBuilder(2000, 2000000);
        carBuilder2024.setModelYear(2024);
        Car car2024 = carBuilder2024.build();

        System.out.println(car2024.getClass().getName() + car2024.hashCode() + " has engine CC " + car2024.getEngineCC() + " price " + car2024.getPrice() + " model year " + car2024.getModelYear());

        Car.CarBuilder carBuilder2021 = new Car.CarBuilder(1800, 1500000);
        Car car2021 = carBuilder2021.build();

        System.out.println(car2021.getClass().getName() + car2021.hashCode() + " has engine CC " + car2021.getEngineCC() + " price " + car2021.getPrice() + " model year " + car2021.getModelYear());
    }
}
