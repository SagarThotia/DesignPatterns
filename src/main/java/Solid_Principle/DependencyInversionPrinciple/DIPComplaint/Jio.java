package Solid_Principle.DependencyInversionPrinciple.DIPComplaint;

public class Jio implements Network
{
    @Override
    public void makeCall(int stdCode, int number) {
        System.out.println("Making a call via jio network on " + stdCode + "-" + number);
    }
}
