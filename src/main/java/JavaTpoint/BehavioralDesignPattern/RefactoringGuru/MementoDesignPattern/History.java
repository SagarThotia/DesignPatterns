package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.MementoDesignPattern;

// CareTaker

import java.util.ArrayList;
import java.util.List;

public class History
{
    private final List<DocumentMemento> mementos;

    public History()
    {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(DocumentMemento memento)
    {
        this.mementos.add(memento);
    }

    public DocumentMemento getMemento(int index)
    {
        return this.mementos.get(index);
    }
}
