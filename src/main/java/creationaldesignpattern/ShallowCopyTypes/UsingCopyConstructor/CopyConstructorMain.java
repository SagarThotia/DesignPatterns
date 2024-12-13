package creationaldesignpattern.ShallowCopyTypes.UsingCopyConstructor;

import java.util.ArrayList;
import java.util.List;

public class CopyConstructorMain
{
    public static void main(String[] args)
    {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Riding Bikes");
        hobbies.add("Tracking");

        Person original = new Person("Alexandra", hobbies);
        Person shallowCopy = new Person(original);

        shallowCopy.getHobbies().add("Research & Development");

        System.out.println("Original: " + original);
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}
