package creationaldesignpattern.DeepCopyTypes.ManualDeepCopyMethod;

import java.util.ArrayList;
import java.util.List;

public class ManualDeepCopy
{
    public static void main(String[] args)
    {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Music");

        Person original = new Person("Sagar", hobbies);
        Person deepCopy = original.deepCopy();

        deepCopy.getHobbies().add("Travelling and Riding Bikes");

        System.out.println("Original: " + original);
        System.out.println("DeepCopy: " + deepCopy);
    }
}
