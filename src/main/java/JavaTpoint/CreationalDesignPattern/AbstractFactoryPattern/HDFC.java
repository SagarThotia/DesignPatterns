package JavaTpoint.CreationalDesignPattern.AbstractFactoryPattern;

public class HDFC implements Bank
{

    private final String BankName;

    public HDFC()
    {
        BankName = "HDFC BANK";
    }

    @Override
    public String getBankName()
    {
        return BankName;
    }
}
