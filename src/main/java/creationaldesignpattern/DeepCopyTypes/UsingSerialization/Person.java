package creationaldesignpattern.DeepCopyTypes.UsingSerialization;


import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
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

    public Person deepCopy()
    {
        try{
            ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOutput);
            out.writeObject(this);

            ByteArrayInputStream byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(byteInput);
            return (Person) inputStream.readObject();

        } catch (IOException | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
