package JavaTpoint.StructuralDesignPattern.FacadePattern;

public class Samsung implements MobileShop
{

    @Override
    public void modelNo()
    {
        System.out.println("Samsung galaxy S21 ultra");
    }

    @Override
    public void price()
    {
        System.out.println("Rs 150000.00");
    }
}
