package creationaldesignpattern.DeepCopyTypes.UsingApacheCoomonsLangLibrary;

import org.apache.commons.lang3.SerializationUtils;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Dancing");
        hobbies.add("Travelling");

        Person original = new Person("Albina", hobbies);
        Person deepCopy = SerializationUtils.clone(original);

        deepCopy.getHobbies().add("Cycling");

        System.out.println("Original: " + original);
        System.out.println("DeepCopy: " + deepCopy);
    }
}
