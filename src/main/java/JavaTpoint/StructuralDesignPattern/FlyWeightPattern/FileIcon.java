package JavaTpoint.StructuralDesignPattern.FlyWeightPattern;

// Concrete Flyweight class representing a File Icon

public class FileIcon implements Icon
{
    private String type; // Intrinsic state: type of file icon (e.g., document, image)
    private String imageName; // Intrinsic state: image name specific to the file icon


    public FileIcon(String type, String imageName)
    {
        this.type = type;
        this.imageName = imageName;
    }

    @Override
    public void draw(int x, int y)
    {
        // Draw logic specific to file icon using intrinsic state (image)
        System.out.println("Drawing " + type + " icon with image " + imageName + " icon at position (" + x + ", " + y + ")");
    }
}
