package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Spammer;

import JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Iterators.ProfileIterator;
import JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Profile.Profile;
import JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Social_Networks.SocialNetwork;

public class SocialSpammer
{
    private SocialNetwork network;
    private ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void sendSpamToFriends(String profileEmail, String message)
    {
        System.out.println("\nIterating over friends...\n");
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext())
        {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail, String message)
    {
        System.out.println("\nIterating over coworkers...\n");
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext())
        {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message)
    {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }


}
