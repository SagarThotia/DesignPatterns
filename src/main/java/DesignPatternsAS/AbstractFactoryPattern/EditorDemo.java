package DesignPatternsAS.AbstractFactoryPattern;

public class EditorDemo
{
    public static void main(String[] args)
    {
        // Create an instance of the LinuxEditorFactory to generate Linux-style components
        EditorFactory factory = new LinuxEditorFactory();

        // Use the factory to create components
        Button button = factory.createButton();
        Menu menu = factory.createMenu();
        ScrollBar scrollBar = factory.createScrollBar();

        // Demonstrate the functionality of each component
        button.click();
        menu.display();
        scrollBar.scroll();

        System.out.println("------------------------------------------");

        EditorFactory windows = new WindowsEditorFactory();

        Button button1 = windows.createButton();
        Menu menu1 = windows.createMenu();
        ScrollBar scrollBar1 = windows.createScrollBar();

        button1.click();
        menu1.display();
        scrollBar1.scroll();
    }
}
