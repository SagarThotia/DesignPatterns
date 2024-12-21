package DesignPatternsAS.AbstractFactoryPattern;

// Concrete Factory for Linux
// LinuxEditorFactory is a Linux-specific factory that creates Linux-style components.
public class LinuxEditorFactory implements EditorFactory
{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new LinuxScrollBar();
    }
}
