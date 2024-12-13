package JavaTpoint.StructuralDesignPattern.FlyWeightPattern.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory
{
    private final Map<String, Product> products = new HashMap<>();

    public Product getProduct(String id)
    {
        Product product = products.get(id);

        if(product == null)
        {
            // simulate fetching product data from a database
            String name = "Product " + id;
            String description = "description for product " + id;
            double price = 99.99; //Sample price
            String category = "Category for product " + id;
            product = new ConcreteProduct(name, description, price, category);
            products.put(id, product);
            System.out.println("Creating new product for ID: " + id);
        }
        return product;
    }
}
