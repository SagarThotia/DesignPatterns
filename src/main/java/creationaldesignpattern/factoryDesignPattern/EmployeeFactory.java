package creationaldesignpattern.factoryDesignPattern;

public class EmployeeFactory
{
    public static Employee getEmployee(String employeeType)
    {
        if(employeeType == null)
        {
            return null;
        }

        if(employeeType.trim().equalsIgnoreCase("ANDROID DEVELOPER"))
        {
            return new AndroidDeveloper();
        }else if(employeeType.trim().equalsIgnoreCase("WEB DEVELOPER"))
        {
            return new WebDeveloper();
        }else{
            return null;
        }
    }
}
