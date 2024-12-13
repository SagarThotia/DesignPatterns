package JavaTpoint.BehavioralDesignPattern.MediatorDesignPattern;

public class User1 extends Participant {
    private String name;
    private ApnaChatRoom chat;

    public User1(ApnaChatRoom chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.showMessage(message,this);
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

}
