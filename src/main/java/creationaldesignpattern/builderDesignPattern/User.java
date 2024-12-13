package creationaldesignpattern.builderDesignPattern;

public class User
{
    private final String userid;
    private final String username;
    private final String emailId;

    private User(UserBuilder builder)
    {
        this.userid = builder.userid;
        this.username = builder.username;
        this.emailId = builder.emailId;
    }

    public String getUserid()
    {
        return userid;
    }

    public String getUsername()
    {
        return username;
    }

    public String getEmailId()
    {
        return emailId;
    }

    @Override
    public String toString()
    {
        return "User {" +
                " userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", emailId= '" + emailId + '\'' +
                '}';
    }

    static class UserBuilder
    {
        private String userid;
        private String username;
        private String emailId;

        public UserBuilder()
        {

        }

        public static UserBuilder builder()
        {
            return new UserBuilder();
        }

        public UserBuilder setUserid(String userid)
        {
            this.userid = userid;
            return this;
        }

        public UserBuilder setUsername(String username)
        {
            this.username = username;
            return this;
        }

        public UserBuilder setEmailId(String emailId)
        {
            this.emailId = emailId;
            return this;
        }

        public User build()
        {
            User user = new User(this);
            return user;
        }
    }
}
