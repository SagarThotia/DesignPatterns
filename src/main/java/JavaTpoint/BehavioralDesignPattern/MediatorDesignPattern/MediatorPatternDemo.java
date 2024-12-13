package JavaTpoint.BehavioralDesignPattern.MediatorDesignPattern;

public class MediatorPatternDemo
{
    public static void main(String[] args)
    {
        ApnaChatRoom chat = new ApnaChatRoomImpl();

        User1 user1 = new User1(chat);
        user1.setName("George Watson");
        user1.sendMessage("Hi George! How are you?");

        User2 user2 = new User2(chat);
        user2.setName("Nico carl");
        user2.sendMessage("I am fine! You tell?");
    }
}
