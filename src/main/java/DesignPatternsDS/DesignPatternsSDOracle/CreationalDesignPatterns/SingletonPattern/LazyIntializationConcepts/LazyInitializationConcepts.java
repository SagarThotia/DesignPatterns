package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.LazyIntializationConcepts;

public class LazyInitializationConcepts
{
    private static LazyInitializationConcepts lazyConcepts = null;

    private LazyInitializationConcepts()
    {
        System.out.println("Object getting created lazily.");
    }

    public static LazyInitializationConcepts getLazyConcepts()
    {
        System.out.println("Returning Get Lazy Concepts instance in Lazy Initialization");
        if(null == lazyConcepts)
        {
            lazyConcepts = new LazyInitializationConcepts();
        }
        return lazyConcepts;
    }
}


/**
 * We will created object on demand.
 * Control came first in getLazyConcepts() and Object is created later. Object getting created lazily on demand.
 * Lazy Initialization also come with its own set of shortcoming and Biggest one.
 * It could be cases where two to three threads invoked on get time.
 * As a result of is lazyConcepts not initialize yet to any thread and therefore all those three threads try creating
 * three different objects of lazyInitializationConcepts.
 * In this case our singleton is violated. we want to create single instance in the entire system in the JVM.
 * But here multiple threads can parallel creates three different systems. If call happens to come at same point of time.
 *
 * How we fixed this issue ?
 */