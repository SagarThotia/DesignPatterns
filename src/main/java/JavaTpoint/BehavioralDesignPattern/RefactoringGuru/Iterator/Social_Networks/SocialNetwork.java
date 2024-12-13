package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Social_Networks;

import JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Iterators.ProfileIterator;

public interface SocialNetwork
{
    public ProfileIterator createFriendsIterator(String profileEmail);
    public ProfileIterator createCoworkersIterator(String profileEmail);
}
