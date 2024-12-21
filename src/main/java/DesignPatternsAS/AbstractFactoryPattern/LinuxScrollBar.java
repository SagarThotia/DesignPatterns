package DesignPatternsAS.AbstractFactoryPattern;

// Concrete Components for Linux.
// LinuxScrollBar is a Linux-specific implementation of the ScrollBar interface

public class LinuxScrollBar implements ScrollBar
{
    @Override
    public void scroll() {
        System.out.println("Scrolling in Linux style.");
    }
}
