package JavaTpoint.StructuralDesignPattern.FacadePattern;

public class Iphone implements MobileShop
{
    @Override
    public void modelNo()
    {
        System.out.println("Iphone 15");
    }

    @Override
    public void price()
    {
        System.out.println("Rs 200000.00");
    }
}
