package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Social_Networks;

import JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Iterators.LinkedInIterator;
import JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Iterators.ProfileIterator;
import JavaTpoint.BehavioralDesignPattern.RefactoringGuru.Iterator.Profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements SocialNetwork
{
    private List<Profile> contacts;

    public LinkedIn(List<Profile> cache)
    {
        if(cache != null)
        {
            this.contacts = cache;
        }else{
            this.contacts = new ArrayList<>();
        }
    }

    public Profile requestContactInfoFromLinkedInAPI(String profileEmail)
    {
        /**
         * Here would be a POST request to one of the LinkedIn API endpoints.
         * Instead, we emulates long network connection, which you would expect
         * in this real life
         */
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");

        // ...and return test data.
        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType)
    {
        /**
         * Here would be a POST request to one of the LinkedIn API endpoints.
         * Instead, we emulates long network connection, which you would expect
         * in the real life...
         */
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        // ...and return text data.
        Profile profile = findContact(profileEmail);
        if(profile != null)
        {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String profileEmail)
    {
        for (Profile profile : contacts)
        {
            if(profile.getEmail().equals(profileEmail))
            {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency()
    {
        try{
            Thread.sleep(2500);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail)
    {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail)
    {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
