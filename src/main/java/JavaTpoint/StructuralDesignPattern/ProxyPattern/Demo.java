package JavaTpoint.StructuralDesignPattern.ProxyPattern;

public class Demo
{
    public static void main(String[] args)
    {
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");
    }
}

/* Now, the user who wants to benefit from the banned-websites functionality can use the proxy without affecting other users.
 *
 * Proxy Design Pattern provides a substitute for another object and controls access to that object, allowing you to perform
 * something before or after the request reaches the original object.
 *
 * It is structural design pattern
 * */
