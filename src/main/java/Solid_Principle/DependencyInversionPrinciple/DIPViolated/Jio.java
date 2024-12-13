package Solid_Principle.DependencyInversionPrinciple.DIPViolated;

public class Jio
{
    public void makeCall(int stdCode, int number)
    {
        System.out.println("Making a call via jio network on " + stdCode + "-" + number);
    }
}
