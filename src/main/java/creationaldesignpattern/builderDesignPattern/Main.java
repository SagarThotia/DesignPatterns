package creationaldesignpattern.builderDesignPattern;

public class Main
{
    public static void main(String[] args)
    {
        User user = new User.UserBuilder()
                    .setEmailId("sam123dev.in")
                    .setUserid("Sam54")
                    .setUsername("Sam")
                    .build();
        System.out.println(user);

        User user1 = User.UserBuilder.builder()
                    .setEmailId("Camly@mail.uk")
                    .setUsername("Camly")
                    .setUserid("Cam65")
                    .build();
        System.out.println(user1);
    }
}
