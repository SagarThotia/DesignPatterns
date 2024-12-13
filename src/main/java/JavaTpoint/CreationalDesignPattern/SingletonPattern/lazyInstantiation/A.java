package JavaTpoint.CreationalDesignPattern.SingletonPattern.lazyInstantiation;

public class A
{
    private static A obj;

    private A()
    {

    }

    public static A getA()
    {
        if(obj == null)
        {
            synchronized(A.class)
            {
                if (obj == null)
                {
                    obj = new A(); // instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doSomething()
    {
        // write your code
    }
}

