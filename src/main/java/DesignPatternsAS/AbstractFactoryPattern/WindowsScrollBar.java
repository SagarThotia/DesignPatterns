package DesignPatternsAS.AbstractFactoryPattern;

public class WindowsScrollBar implements ScrollBar
{
    @Override
    public void scroll() {
        System.out.println("Scrolling Windows-style scroll");
    }
}
