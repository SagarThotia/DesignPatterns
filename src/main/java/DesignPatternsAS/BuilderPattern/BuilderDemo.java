package DesignPatternsAS.BuilderPattern;

public class BuilderDemo
{
    public static void main(String[] args)
    {
        // Create a builder for a gaming computer.
        ComputerBuilder builder = new GamingComputerBuilder();

        // Use the director to construct the gaming computer
        // with specified configuration
        ComputerDirector director = new ComputerDirector();
        Computer gamingComputer = director.buildGamingComputer(builder);

        //Display the specification of the constructed gaming computer.
        System.out.println("Gaming Computer Specifications:");
        System.out.println(gamingComputer.getSpecs());
    }

}
