package JavaTpoint.CreationalDesignPattern.AbstractFactoryPattern;

public class SBI implements Bank
{
    private final String BankName;

    public SBI()
    {
        BankName = "SBI BANK";
    }

    @Override
    public String getBankName()
    {
        return BankName;
    }
}
