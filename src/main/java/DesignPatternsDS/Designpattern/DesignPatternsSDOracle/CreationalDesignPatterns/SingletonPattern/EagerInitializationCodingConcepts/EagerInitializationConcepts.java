package Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.EagerInitializationCodingConcepts;

public class EagerInitializationConcepts
{
    private static final EagerInitializationConcepts eager = new EagerInitializationConcepts();

    private EagerInitializationConcepts()
    {
        System.out.println("Object getting created eagerly");
    }

    public static EagerInitializationConcepts getEager()
    {
        System.out.println("Returning static eager instance in eager initialization");
        return eager;
    }
}


/**
 * When system is bootup and returning static eager instance in eager initialization.
 * Object remains the same that signifies single instance is created inside system.
 * We made this private static variable final in nature so that it can't be reinitialize ever by any method in this entire class.
 * */