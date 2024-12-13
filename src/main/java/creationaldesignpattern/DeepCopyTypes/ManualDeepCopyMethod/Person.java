package creationaldesignpattern.DeepCopyTypes.ManualDeepCopyMethod;

import java.util.ArrayList;
import java.util.List;

public class Person
{
    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies)
    {
        this.name = name;
        this.hobbies = hobbies;
    }

    public Person deepCopy()
    {
        List<String> hobbiesCopy = new ArrayList<>(this.hobbies);
        return new Person(this.name, hobbiesCopy);
    }

    public List<String> getHobbies()
    {
        return hobbies;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
