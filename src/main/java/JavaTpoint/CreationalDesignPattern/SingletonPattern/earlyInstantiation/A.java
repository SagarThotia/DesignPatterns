package JavaTpoint.CreationalDesignPattern.SingletonPattern.earlyInstantiation;

public class A
{
    private static A obj = new A(); // Early instance will be created at load time.

    private A()
    {

    }

    public static A getA()
    {
        return obj;
    }

    public void dosomething()
    {
        // write your code
    }
}
