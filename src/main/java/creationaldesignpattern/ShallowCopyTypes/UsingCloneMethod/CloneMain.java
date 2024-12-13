package creationaldesignpattern.ShallowCopyTypes.UsingCloneMethod;

import java.util.ArrayList;
import java.util.List;

public class CloneMain
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Swimming");

        Person original = new Person("Alice", hobbies);
        Person shallowCopy = (Person) original.clone();

        shallowCopy.getHobbies().add("Gym");

        System.out.println("Original: " + original);
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}
