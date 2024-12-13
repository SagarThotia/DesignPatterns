package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Iterators;

import JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Profile.Profile;

public interface ProfileIterator
{
    public boolean hasNext();
    public Profile getNext();
    public void reset();
}
