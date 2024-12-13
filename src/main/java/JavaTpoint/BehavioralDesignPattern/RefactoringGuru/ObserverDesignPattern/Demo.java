package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.ObserverDesignPattern;

import java.io.File;

public class Demo
{
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener(new File("src//JavaPoint//BehavioralDesignPattern//RefactoringGuru//ObserverDesignPattern//sam.txt")));
        editor.events.unsubscribe("save", new EmailNotificationListener("admin@example.com"));

        try{
            editor.openFile("src//JavaPoint//BehavioralDesignPattern//RefactoringGuru//ObserverDesignPattern//sam.txt");
            editor.saveFile();
        }catch (Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
}
