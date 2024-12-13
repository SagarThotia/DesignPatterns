package creationaldesignpattern.DeepCopyTypes.UsingGson;

import java.util.ArrayList;
import java.util.List;

public class GsonMain
{
    public static void main(String[] args)
    {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Running");

        Person original = new Person("Anna", hobbies);
        Person deepCopy = original.deepCopy();

        deepCopy.getHobbies().add("Cricket");

        System.out.println("Original: " + original);
        System.out.println("DeepCopy: " + deepCopy);
    }
}
