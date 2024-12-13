package creationaldesignpattern.AbstractFactoryDesignPattern;

public class Client
{
    public static void main(String[] args)
    {
       Employee emp1 =  EmployeeFactory.getEmployee(new AndroidDevFactory());
       emp1.name();

       Employee emp2 = EmployeeFactory.getEmployee(new WebDevFactory());
       emp2.name();

       Employee emp3 = EmployeeFactory.getEmployee(new ManagerFactory());
       emp3.name();
    }
}
