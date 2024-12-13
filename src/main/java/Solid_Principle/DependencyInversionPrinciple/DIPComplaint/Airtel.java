package Solid_Principle.DependencyInversionPrinciple.DIPComplaint;

public class Airtel implements Network
{
    @Override
    public void makeCall(int stdCode, int number) {
        System.out.println("Making a call via airtel network on " + stdCode + "-" + number);
    }
}
