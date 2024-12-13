package creationaldesignpattern.ShallowCopyTypes.UsingCloneMethod;

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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
