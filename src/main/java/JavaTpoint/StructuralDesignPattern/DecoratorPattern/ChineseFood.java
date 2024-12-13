package JavaTpoint.StructuralDesignPattern.DecoratorPattern;

public class ChineseFood extends FoodDecorator
{
    public ChineseFood(Food newFood)
    {
        super(newFood);
    }

    @Override
    public String prepareFood()
    {
        return super.prepareFood() + " with Fried Rice and Manchurian. ";
    }

    @Override
    public double foodPrice()
    {
        return super.foodPrice() + 65.0;
    }
}
