package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.ObserverDesignPattern;

import java.io.File;

public class Editor
{
    protected final EventManager events;
    private File file;

    public Editor()
    {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath)
    {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception
    {
        if(this.file != null)
        {
            events.notify("save", file);
        }else{
            throw new RuntimeException("Please open a file first.");
        }
    }

}
