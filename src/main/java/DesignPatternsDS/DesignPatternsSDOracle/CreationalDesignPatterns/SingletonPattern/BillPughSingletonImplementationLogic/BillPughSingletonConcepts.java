package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.BillPughSingletonImplementationLogic;

public class BillPughSingletonConcepts
{
    private BillPughSingletonConcepts()
    {
        System.out.println("Creating instance of Bill pugh");
    }

    // Static inner class
    private static class SingletonHelper
    {
        public SingletonHelper()
        {
            System.out.println("Creating instance of SingletonHelper.");
        }

        private static final BillPughSingletonConcepts INSTANCE = new BillPughSingletonConcepts();
    }

    public static BillPughSingletonConcepts getBillPugh()
    {
        System.out.println("Returning instance of bill pugh");
        return SingletonHelper.INSTANCE;
    }
}

/**
 * static private variable inside the innerClass which basically creates a new Object of the outer class
 * Remember : This is a static class inner class his object never create during load time.
 * In getter, he simply return the singletonHelper.INSTANCE; Which basically points to this object (INSTANCE) and it gets initialize on demand.
 * when control comes over here for the first time.
 *
 * This kind of implementation is threadSafe in nature because inside getBillPugh() method we are pointing to the static variable
 * that is part of the static variable class, and it internally points to the object of the parent class.
 * For this virtue concurrency issue never come.
 */