package Solid_Principle.DependencyInversionPrinciple.DIPComplaint;

public class DemoMain
{
    public static void main(String[] args)
    {
        int stdCode = 91;
        int number = 987654321;

        // Making a call via Jio network.
        Network network = new Airtel();
        network.makeCall(stdCode, number);
    }
}

/**
 * Network network = new Jio()
 *
 * Now let's assume you are interested in making a call by Jio network.
 * Please pay attention to line no.12 what do you do?
 * we write Network that is acting as a reference to our interface
 * Network network = new Jio();
 * whenever you want to make a call the network interface already exposes a make call method
 * so network. make call you pass in the required argument to it.
 *
 * let's assume years later we want to replace this jio implementation with airtel1.
 * The contract would remain the same only the reference objects get altered.
 * so here instead of jio we have written new Airtel let run this up making a call by airtel network
 *
 * With this example we saw whenever the highlevel class as in this case is demomain is interacting with
 * the interface the contract always remains a same irrespective of what actual concrete low level class is being
 * used as reference. The contract between the network and the high level class remained the same irrespective which
 * reference whether it was JIO or Airtel that was being used over here.
 *
 * So this is what DIP states
 * we should always communicate between classes low-level and high-level via interface contracts
 *
 */