package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.ThreadSafeConcepts;

public class ThreadSafeSingletonConcepts
{
    private static ThreadSafeSingletonConcepts threadSafe = null;

    private ThreadSafeSingletonConcepts()
    {
        System.out.println("Object getting created inside thread safe");
    }

    public synchronized static ThreadSafeSingletonConcepts getThreadSafe()
    {
        System.out.println("Returning Get Thread Safe instance in Thread Safe Singleton class");
        if(null == threadSafe)
        {
            threadSafe = new ThreadSafeSingletonConcepts();
        }
        return threadSafe;
    }
}


/**
 * To fix this issue we make getThreadSafe() method synchronized in nature.
 * So that one thread is entered and taken a control and other two thread continue to wait outside
 * and this will make sure that only single instance get created in the system.
 * But this with its own set of shortcoming and that would be slowness. System will slow for those
 * cases were multiple threads are trying to create the same instance at the same point of time.
 *
 * How we improve this?
 */