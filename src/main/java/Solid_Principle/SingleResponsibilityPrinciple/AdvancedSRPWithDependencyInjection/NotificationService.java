package Solid_Principle.SingleResponsibilityPrinciple.AdvancedSRPWithDependencyInjection;

public class NotificationService
{
    public void sendWelcomeEmail(String email)
    {
        System.out.println("Welcome email sent to " + email);
    }
}
