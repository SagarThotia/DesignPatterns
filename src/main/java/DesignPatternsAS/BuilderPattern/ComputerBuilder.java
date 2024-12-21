package DesignPatternsAS.BuilderPattern;

// Builder interface
// The computerBuilder interface defines methods
// to set each component and build the product.
public interface ComputerBuilder
{
    void setRAM(String RAM);
    void setStorage(String storage);
    void setGPU(String GPU);
    Computer build(); // Returns the fully constructed product.
}
