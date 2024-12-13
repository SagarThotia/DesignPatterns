package JavaTpoint.CreationalDesignPattern.AbstractFactoryPattern;

public class BusinessLoan extends Loan
{
    @Override
    public void getInterestRate(double rate)
    {
        this.rate = rate;
    }
}
