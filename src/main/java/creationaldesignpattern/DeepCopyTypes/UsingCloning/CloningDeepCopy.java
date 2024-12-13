package creationaldesignpattern.DeepCopyTypes.UsingCloning;

import java.util.ArrayList;
import java.util.List;

public class CloningDeepCopy
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Riding");
        hobbies.add("Swimming");

        Person original = new Person("Alice", hobbies);
        Person deepCopy = original.clone();

        deepCopy.getHobbies().add("Cycling");

        System.out.println("Original: " + original);
        System.out.println("DeepCopy: " + deepCopy);
    }
}
