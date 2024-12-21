package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.PrototypeDesignPattern;

public abstract class Car implements VehicleInterface, Cloneable
{
    private int modelYear;

    public Car()
    {

    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public Car(Car car) {
        this.modelYear = car.modelYear;
    }

//    @Override
    protected Car clone(Car car)
    {
        try{
            return (Car) car.clone();
        }catch (CloneNotSupportedException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
}
