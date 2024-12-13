package JavaTpoint.StructuralDesignPattern.FlyWeightPattern.ecommerce;

import java.util.Date;

public class FlyWeightEcommerceDemo
{
    public static void main(String[] args)
    {
        ProductFactory factory = new ProductFactory();

        // Simulate viewing products on an e-commerce site
        displayProduct(factory, "P123", "UserA", "HomePage", 2, "New York");
        displayProduct(factory, "P124", "UserB", "ProductPage", 1, "Los Angeles");
        displayProduct(factory, "P123", "UserC", "CategoryPage", 3, "Chicago");
        displayProduct(factory, "P125", "UserA", "SearchResults", 4, "Houston");
    }

    private static void displayProduct(ProductFactory factory, String productId, String userId, String page, int quantity, String location)
    {
        Product product = factory.getProduct(productId);
        ProductInfo info = new ProductInfo(userId, new Date(), page, quantity, location);
        product.display(info);
    }
}
