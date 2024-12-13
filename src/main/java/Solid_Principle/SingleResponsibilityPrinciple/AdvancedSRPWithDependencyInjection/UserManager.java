package Solid_Principle.SingleResponsibilityPrinciple.AdvancedSRPWithDependencyInjection;

public class UserManager
{
    private final NotificationService notificationService;

    public UserManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void addUser(String name, String email)
    {
        System.out.println("User added: " + name);
        notificationService.sendWelcomeEmail(email);
    }
}
