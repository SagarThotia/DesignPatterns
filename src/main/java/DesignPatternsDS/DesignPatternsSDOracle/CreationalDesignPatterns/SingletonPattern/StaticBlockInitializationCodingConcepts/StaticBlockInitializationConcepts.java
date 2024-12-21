package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.SingletonPattern.StaticBlockInitializationCodingConcepts;

public class StaticBlockInitializationConcepts
{
    private static StaticBlockInitializationConcepts staticBlock = null;

    static {
        try{
            staticBlock = new StaticBlockInitializationConcepts();
        }catch (Exception e)
        {
            throw new RuntimeException("Exception occurred is creating singleton instance");
        }
    }

    private StaticBlockInitializationConcepts()
    {
        System.out.println("Object getting created in static block Initialization");
    }

    public static StaticBlockInitializationConcepts getStaticBlock()
    {
        System.out.println("Returning get Static Block instance in static block Initialization");
        return staticBlock;
    }
}


/**
 * As we can see object getting created in staticBlock Initialization came before the returning get staticBlock
 * instance that means the object was loaded eagerly in memory
 *
 * Problem of eager loading:
 * It will load on load time.
 * If this can happen were there are many resource through your constructor, you keep hopping the resource.
 * for eg:
 * Database Connection: It will most expensive in nature.
 * Although in your system call is not came into your system for get().
 * still you established the connection and sat down.
 * There could be cases and chances. Some other system needed resources but since you eagerly allocated for yourself resource.
 * System want that resource, but you already allocated for yourself for that It will not allocate for their usage.
 *
 *  In that case what we could do?
 *  let's move on to lazy initialization.
 *
 *  Lazy Initialization come to rescue.
 *
 * */