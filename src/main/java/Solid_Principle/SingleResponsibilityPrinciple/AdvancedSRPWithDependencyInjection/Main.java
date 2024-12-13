package Solid_Principle.SingleResponsibilityPrinciple.AdvancedSRPWithDependencyInjection;

public class Main
{
    public static void main(String[] args)
    {
        NotificationService notificationService = new NotificationService();
        UserManager userManager = new UserManager(notificationService);

        userManager.addUser("Claret", "claret42@yahoo.com");
    }
}
