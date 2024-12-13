package creationaldesignpattern.ShallowCopyTypes.UsingCopyConstructor;

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

    //Copy Constructor
    public Person(Person other)
    {
        this.name = other.name;
        this.hobbies = other.hobbies;
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
