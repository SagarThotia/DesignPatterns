package creationaldesignpattern.DeepCopyTypes.UsingCopyConstructor;

import java.util.ArrayList;
import java.util.List;

public class CopyConstructor
{
    public static void main(String[] args)
    {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Riding");
        hobbies.add("Listening Music");

        Person original = new Person("Sam",hobbies);
        Person deepCopy = new Person(original);

        deepCopy.getHobbies().add("Research & Development");

        System.out.println("Original:  " + original);
        System.out.println("Deep Copy: " + deepCopy);
    }
}
