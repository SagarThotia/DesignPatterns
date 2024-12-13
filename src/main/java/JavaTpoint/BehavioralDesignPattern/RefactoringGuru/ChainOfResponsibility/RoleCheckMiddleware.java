package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.ChainOfResponsibility;

public class RoleCheckMiddleware extends Middleware
{
    /**
     * ConcreteHandler. Checks a user's role.
     * */

    @Override
    public boolean check(String email, String password) {
        if(email.equals("admin@example.com"))
        {
            System.out.println("Hello,admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
