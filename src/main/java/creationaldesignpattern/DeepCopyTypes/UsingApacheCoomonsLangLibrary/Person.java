package creationaldesignpattern.DeepCopyTypes.UsingApacheCoomonsLangLibrary;


import java.io.Serializable;
import java.util.List;

public class Person implements Serializable
{
    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies)
    {
        this.name = name;
        this.hobbies = hobbies;
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
