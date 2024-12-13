package creationaldesignpattern.factoryDesignPattern;

public class WebDeveloper implements Employee
{

    @Override
    public int salary()
    {
        System.out.println("Getting Web developer salary.");
        return 60000;
    }
}
