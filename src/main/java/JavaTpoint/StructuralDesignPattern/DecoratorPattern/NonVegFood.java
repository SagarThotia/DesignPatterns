package JavaTpoint.StructuralDesignPattern.DecoratorPattern;

public class NonVegFood extends FoodDecorator
{
    public NonVegFood(Food newFood)
    {
        super(newFood);
    }

    @Override
    public String prepareFood()
    {
        return super.prepareFood() + " with Roasted Chicken and Chicken Curry. ";
    }

    @Override
    public double foodPrice()
    {
        return super.foodPrice() + 150.0;
    }
}
