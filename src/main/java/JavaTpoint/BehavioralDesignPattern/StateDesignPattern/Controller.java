package JavaTpoint.BehavioralDesignPattern.StateDesignPattern;

public class Controller
{
    private static Accounting account;
    private static Sales sales;
    private static Management management;
    private static Connection connection;

    public Controller()
    {
        account = new Accounting();
        sales = new Sales();
        management = new Management();
    }

    public void setAccountingConnection() {
        connection = account;
    }

    public void setSalesConnection() {
        connection = sales;
    }

    public void setManagementConnection() {
        connection = management;
    }

    public void open()
    {
        connection.open();
    }

    public void close()
    {
        connection.close();
    }

    public void log()
    {
        connection.log();
    }

    public void update()
    {
        connection.update();
    }
}
