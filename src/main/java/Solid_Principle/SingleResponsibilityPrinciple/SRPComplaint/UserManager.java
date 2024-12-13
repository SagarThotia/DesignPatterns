package Solid_Principle.SingleResponsibilityPrinciple.SRPComplaint;

// Class responsible for user management
public class UserManager
{
    public void addUser(String name, String email)
    {
        System.out.println("User added: " + name);
        NotificationService notificationService = new NotificationService();
        notificationService.sendWelcomeEmail(email);
    }
}
