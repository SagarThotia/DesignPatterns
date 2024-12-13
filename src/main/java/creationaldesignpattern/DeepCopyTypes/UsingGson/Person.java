package creationaldesignpattern.DeepCopyTypes.UsingGson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(this);
        return gson.fromJson(json, Person.class);
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
