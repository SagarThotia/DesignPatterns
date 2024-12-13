package AdapterDesignPattern;

public class Demo
{
    public static void main(String[] args)
    {
        AppleCharger charger = new AdapterCharger(new DKCharger());
        Iphone13 iphone13 = new Iphone13(charger);
        iphone13.chargePhone();
    }
}
