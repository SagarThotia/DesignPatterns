package DesignPatternsAS.BuilderPattern;

// Product class
// The Computer class represents the complex object to be built.
public class Computer
{
    private String RAM;
    private String storage;
    private String GPU;

    // Setters for each component

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }


    public String getSpecs() {
        return "RAM: " + RAM + ", storage: " + storage + ", GPU: " + GPU;
    }
}
