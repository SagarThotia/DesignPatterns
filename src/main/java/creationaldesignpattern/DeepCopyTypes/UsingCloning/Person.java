package creationaldesignpattern.DeepCopyTypes.UsingCloning;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable
{
    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies)
    {
        this.name = name;
        this.hobbies = hobbies;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException
    {
        try{
            Person cloned = (Person) super.clone();
            cloned.hobbies = new ArrayList<>(this.hobbies);
            return cloned;
        }catch (CloneNotSupportedException e)
        {
            throw new RuntimeException(e);
        }
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
