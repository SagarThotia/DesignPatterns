package Solid_Principle.SingleResponsibilityPrinciple.SRPViolated;

public class Main
{
    public static void main(String[] args)
    {
        UserManager userManager = new UserManager();
        userManager.addUser("Sam", "sam25@dev.com");
        userManager.sendWelcomeEmail("sam25@dev.com");
    }
}
