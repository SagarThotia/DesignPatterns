package JavaTpoint.BehavioralDesignPattern.IteratorDesignPattern;

public class IteratorPatternDemo
{
    public static void main(String[] args)
    {
        CollectionOfNames companyRepository = new CollectionOfNames();

        for (Iterator iterator = companyRepository.getIterator(); iterator.hasNext();)
        {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
