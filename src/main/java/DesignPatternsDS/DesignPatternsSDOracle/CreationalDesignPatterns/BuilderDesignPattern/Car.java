package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.BuilderDesignPattern;

public class Car
{
    private final int engineCC;
    private final int price;

    // Optional
    private final int modelYear;

    public int getEngineCC() {
        return engineCC;
    }

    public int getPrice() {
        return price;
    }

    public int getModelYear() {
        return modelYear;
    }

    private Car(CarBuilder carBuilder) {
        this.engineCC = carBuilder.engineCC;
        this.price = carBuilder.price;
        this.modelYear = carBuilder.modelYear;
    }

    // Builder Class
    public static class CarBuilder
    {
        private final int engineCC;
        private final int price;
        private int modelYear;

        public void setModelYear(int modelYear) {
            this.modelYear = modelYear;
        }

        public CarBuilder(int engineCC, int price)
        {
            this.engineCC = engineCC;
            this.price = price;
        }

        public Car build()
        {
            return new Car(this);
        }
    }
}

/**
 * price and engine
 * we never expose setters
 * We create constructor is actually private in nature
 * */