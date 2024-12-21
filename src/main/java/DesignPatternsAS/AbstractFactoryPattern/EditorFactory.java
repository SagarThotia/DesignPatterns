package DesignPatternsAS.AbstractFactoryPattern;

// Abstract Factory Interface
// EditorFactory is an interface that declares creation methods for each component type.
public interface EditorFactory
{
    Button createButton();
    Menu createMenu();
    ScrollBar createScrollBar();
}
