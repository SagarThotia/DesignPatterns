package Solid_Principle.DependencyInversionPrinciple.DIPViolated;

public class DemoMain
{
    public static void main(String[] args)
    {
        int stdCode = 91;
        int number = 98765431;

//        // Making a call via Jio network
//        Jio jio = new Jio();
//        jio.makeCall(stdCode, number);

        Airtel airtel= new Airtel();
        airtel.makeCall(stdCode, number);
    }
}


/**
 * This is not a sustainable solution as I talked about long run
 * Everytime we change the code of lowlevel classes it its impact will
 * reflected in our main high level code as well.
 *
 *  How we address this problem.
 */