package DesignPatternsAS.AbstractFactoryPattern;

// Concrete Components for Linux
// LinuxButton is a Linux-specific implementation of the Button interface
public class LinuxButton implements Button
{
    @Override
    public void click() {
        System.out.println("Linux-style button clicked");
    }
}
