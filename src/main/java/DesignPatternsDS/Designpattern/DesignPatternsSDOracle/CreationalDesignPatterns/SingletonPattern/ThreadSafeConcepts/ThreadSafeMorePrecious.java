package Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.ThreadSafeConcepts;

public class ThreadSafeMorePrecious
{
     private static ThreadSafeMorePrecious threadSafe = null;

    private ThreadSafeMorePrecious()
    {
        System.out.println("Object getting created inside thread safe");
    }

    public static ThreadSafeMorePrecious getThreadSafe()
    {
        System.out.println("Entering Get Thread Safe");
        if(null == threadSafe)
        {
            synchronized (ThreadSafeMorePrecious.class)
            {
                threadSafe = new ThreadSafeMorePrecious();
            }
        }
        return threadSafe;
    }
}


/**
 * This kind of initialization is lazy in nature however ThreadSafe implements also had an issue.
 * At that point of time Java5 was there As a result of which in order to address those memory issues
 * Bill pugh introduce a unique way of creating singleton implementation and name was after him BillPughSingletonImplementationLogic
 * Let's create a static innerclass for the purpose of creating that particular instance.
 */