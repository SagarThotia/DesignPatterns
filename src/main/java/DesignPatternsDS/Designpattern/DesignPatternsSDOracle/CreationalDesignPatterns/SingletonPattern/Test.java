package Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern;

import Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.BillPughSingletonImplementationLogic.BillPughSingletonConcepts;
import Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.EagerInitializationCodingConcepts.EagerInitializationConcepts;
import Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.LazyIntializationConcepts.LazyInitializationConcepts;
import Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.StaticBlockInitializationCodingConcepts.StaticBlockInitializationConcepts;
import Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.ThreadSafeConcepts.ThreadSafeMorePrecious;
import Designpattern.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.ThreadSafeConcepts.ThreadSafeSingletonConcepts;

public class Test
{
    public static void main(String[] args)
    {
//        System.out.println("Object Id is " + EagerInitializationConcepts.getEager() + "\n\n");

//        System.out.println("Object Id is " + EagerInitializationConcepts.getEager() + "\n\n");

//        System.out.println("Object Id is " + StaticBlockInitializationConcepts.getStaticBlock() + "\n\n");

//        System.out.println("Object Id is " + LazyInitializationConcepts.getLazyConcepts() + "\n\n");
        
//        System.out.println("Object Id is " + ThreadSafeSingletonConcepts.getThreadSafe() + "\n\n");

//        System.out.println("Object Id is " + ThreadSafeMorePrecious.getThreadSafe() + "\n\n");

          System.out.println("Object Id is " + BillPughSingletonConcepts.getBillPugh() + "\n\n");
    }
}


/**
 * Follow the series of implementation
 * 1. Eager Initialization.
 * 2. Static Block Initialization.
 * 3. Lazy Initialization.
 * 4. Thread safe singleton.
 * 5. Bill pugh singleton Implementation.
 */