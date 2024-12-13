package Solid_Principle.SingleResponsibilityPrinciple.SRPViolated;

public class UserManager
{
    public void addUser(String name, String email)
    {
        // Add user to the database
        System.out.println("User added: " + name);
    }

    public void sendWelcomeEmail(String email)
    {
        // Logic to send a welcome email
        System.out.println("Welcome email sent to: " + email);
    }
}
