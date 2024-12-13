package creationaldesignpattern.clones;

import java.io.Serializable;

public class Samosa implements Serializable,Cloneable
{
    private static Samosa samosa;
    // constructor
    private Samosa()
    {
        if(samosa != null)
        {
            throw new RuntimeException(" You are trying to break singleton pattern");
        }
    }

//    // Lazy way of creating single object withput multithreaded env
//    public static Samosa getSamosa()
//    {
//        // object of this class
//        if(samosa == null)
//        {
//           samosa = new Samosa();
//        }
//        return samosa;
//    }

//    // Lazy way of creating single object
//    public synchronized static Samosa getSamosa()
//    {
//        // object of this class
//        if(samosa == null)
//        {
//            samosa = new Samosa();
//        }
//        return samosa;
//    }

    // Lazy way of creating single object
    public static Samosa getSamosa()
    {
        // object of this class
        if(samosa == null)
        {
            // Thread safety singleton
            synchronized (Samosa.class)
            {
                if(samosa == null)
                {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }


    public Object readResolve()
    {
        return samosa;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return samosa;
    }
}



/*
 * 1. constructor private
 *
 * 2. object create with the help of method
 *
 * 3. create field to store object is private
 *
 */


/*
 * Disadvantages of lazy loading
 *
 * 1. when we call method then object is created, so object is created at the start,
 *    The problem here we didn't pay attention to threads. it is not specific to thread environment.
 *
 *
 *
 *
 */