package DesignPatternsAS.AbstractFactoryPattern;

// Concrete Components for Linux.
// LinuxMenu is a Linux-specific implementation of the Menu interface
public class LinuxMenu implements Menu
{
    @Override
    public void display() {
        System.out.println("Displaying Linux-style menu.");
    }
}