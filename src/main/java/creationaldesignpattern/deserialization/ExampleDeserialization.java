package creationaldesignpattern.deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

public class ExampleDeserialization
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(samosa);

        System.out.println("Serialization done...");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa s2 = (Samosa) ois.readObject();
        System.out.println(s2.hashCode());

        oos.close();
        ois.close();
    }
}
