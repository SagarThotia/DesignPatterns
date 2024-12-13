package creationaldesignpattern.DeepCopyTypes.UsingSerialization;

import java.util.ArrayList;
import java.util.List;

public class SerializationDeepCopy
{
    public static void main(String[] args)
    {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Riding Bikes");

        Person original = new Person("Sam", hobbies);
        Person deepCopy = original.deepCopy();

        deepCopy.getHobbies().add("Research & Development");

        System.out.println("Original: " + original);
        System.out.println("DeepCopy: " + deepCopy);
    }
}
