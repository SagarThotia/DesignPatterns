package JavaTpoint.StructuralDesignPattern.ProxyPattern.ProxyDemo;

public class ProxyPatternClient
{
    public static void main(String[] args)
    {
        OfficeInternetAccess access = new ProxyInternetAccess("Sagar Thotia");
        access.grantInternetAccess();
    }
}
