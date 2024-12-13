package JavaTpoint.StructuralDesignPattern.FlyWeightPattern.ecommerce;

import java.util.Date;

public class ProductInfo
{
    private final String userId;
    private final Date viewingTime;
    private final String page;
    private final int quantity;
    private final String location;

    public ProductInfo(String userId, Date viewingTime, String page, int quantity, String location)
    {
        this.userId = userId;
        this.viewingTime = viewingTime;
        this.page = page;
        this.quantity = quantity;
        this.location = location;
    }

    public String getUserId() {
        return userId;
    }

    public Date getViewingTime() {
        return viewingTime;
    }

    public String getPage() {
        return page;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getLocation() {
        return location;
    }
}
