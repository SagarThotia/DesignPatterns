package DesignPatternsAS.AbstractFactoryPattern;

public class WindowsEditorFactory implements EditorFactory
{

    @Override
    public Button createButton()
    {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu()
    {
        return new WindowsMenu();
    }

    @Override
    public ScrollBar createScrollBar()
    {
        return new WindowsScrollBar();
    }
}
