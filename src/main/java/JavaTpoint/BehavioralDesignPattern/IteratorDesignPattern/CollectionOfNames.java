package JavaTpoint.BehavioralDesignPattern.IteratorDesignPattern;

public class CollectionOfNames implements Container
{
    private final String[] names = {"Sam Watson", "Izzy Stevens", "Irina Shepherd", "Jacob Watson", "Bailey Parker"};

    @Override
    public Iterator getIterator() {
        return new CollectionOfNamesIterate();
    }

    private class CollectionOfNamesIterate implements Iterator
    {
        private int i;

        @Override
        public Object next()
        {
            if(this.hasNext())
            {
                return names[i++];
            }
            return null;
        }

        @Override
        public boolean hasNext()
        {
            if(i< names.length)
            {
                return true;
            }
            return false;
        }
    }
}
