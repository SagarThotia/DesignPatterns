package AdapterDesignPattern;

public class DKCharger implements AndroidCharger
{
    @Override
    public void chargerAndroidPhone()
    {
        System.out.println("Your Android Phone is charging.");
    }
}
