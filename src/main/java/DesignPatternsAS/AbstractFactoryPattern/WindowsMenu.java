package DesignPatternsAS.AbstractFactoryPattern;

public class WindowsMenu implements Menu
{
    @Override
    public void display() {
        System.out.println("Displaying Windows-style menu.");
    }
}
