package DesignPatternsAS.BuilderPattern;

// Optional Director
// The ComputerDirector class defines a sequence for building a specific type of Computer
// The director controls the construction steps and makes the process reusable.
public class ComputerDirector
{
    // This method accepts a builder and configures it to.
    // create a gaming computer
    public Computer buildGamingComputer(ComputerBuilder builder)
    {
        builder.setRAM("4096");
        builder.setStorage("2TB SSD");
        builder.setGPU("RTX 3080");
        return builder.build();
    }
}
