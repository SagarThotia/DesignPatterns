package Solid_Principle.DependencyInversionPrinciple.DIPViolated;

public class Airtel
{
    public void makeCall(int stdCode, int number)
    {
        System.out.println("Making a call via airtel network on " + stdCode + "-" + number);
    }
}
