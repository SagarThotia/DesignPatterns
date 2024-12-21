package DesignPatternsAS.BuilderPattern;
// Concrete Builder for Gaming Computer
// The GamingComputerBuilder is a concrete implementation of the ComputerBuilder
// which builds a computer configured for gaming
public class GamingComputerBuilder implements ComputerBuilder
{
    private Computer computer = new Computer();

    // Each setter method configures a component of the Computer.
    @Override
    public void setRAM(String RAM) {
        computer.setRAM(RAM);
    }

    @Override
    public void setStorage(String storage) {
        computer.setStorage(storage);
    }

    @Override
    public void setGPU(String GPU) {
        computer.setGPU(GPU);
    }

    // Returns the constructed computer object
    // Build method with validation and default setting logic

    @Override
    public Computer build() {
        // Validation: Ensure RAM and storage are set
        if(computer.getSpecs().contains("RAM: null"))
        {
            throw new IllegalStateException("RAM must be specified!");
        }
        if(computer.getSpecs().contains("storage: null"))
        {
            throw new IllegalStateException("Storage must be specified!");
        }

        //Default GPU setting if GPU is not specified
        if(computer.getSpecs().contains("GPU: null"))
        {
            computer.setGPU("Integrated GPU"); // Default for basic graphics
        }
        return computer;
    }
}
