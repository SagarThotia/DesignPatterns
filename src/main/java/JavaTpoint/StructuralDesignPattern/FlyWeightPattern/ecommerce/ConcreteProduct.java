package JavaTpoint.StructuralDesignPattern.FlyWeightPattern.ecommerce;

public class ConcreteProduct implements Product
{
    private final String name; // Intrinsic data
    private final String description; // Intrinsic data
    private final double price;  // Intrinsic data
    private final String category; // Intrinsic data

    public ConcreteProduct(String name, String description, double price, String category)
    {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }


    @Override
    public void display(ProductInfo info)
    {
        System.out.println("Product [Name: " + name + ", Description: " + description + ", Price: $" + price +
                ", Category: " + category + "] displayed for user " + info.getUserId() + ", on page " + info.getPage() +
                ", at " + info.getViewingTime() + ", Quantity: " + info.getQuantity() + " Location: " + info.getLocation());
    }
}
