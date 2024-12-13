package creationaldesignpattern.multithreadedenvsingleton;

public class Jalebi
{
    // Eager way of creating a singleton object
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi()
    {
        return jalebi;
    }
}


/*
 *
 *  Disadvantages of Eager Way
 *  1. Client was not required to have this object in the entire project, Jalebi was not required to be required but here, Eager way is already created the object and kept it in advance. If it is required, then you will take it or if you don't need it then doesn't take it we have to create it, now will you face any problem.
 *     It is not good for a bigger project.
 *
 *
 *
 *
*/