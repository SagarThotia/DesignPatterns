package creationaldesignpattern.clones;

public class Example
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Samosa s2 = (Samosa) samosa.clone();
        System.out.println(s2.hashCode());
    }
}
