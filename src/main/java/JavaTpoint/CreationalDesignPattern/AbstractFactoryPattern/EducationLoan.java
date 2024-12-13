package JavaTpoint.CreationalDesignPattern.AbstractFactoryPattern;

public class EducationLoan extends Loan
{

    @Override
    public void getInterestRate(double rate)
    {
        this.rate = rate;
    }
}
