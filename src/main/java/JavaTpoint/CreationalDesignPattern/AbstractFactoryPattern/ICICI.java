package JavaTpoint.CreationalDesignPattern.AbstractFactoryPattern;

public class ICICI implements Bank
{
    private final String BanKName;

    public ICICI()
    {
        BanKName = "HDFC BANK";
    }

    @Override
    public String getBankName()
    {
        return BanKName;
    }
}
