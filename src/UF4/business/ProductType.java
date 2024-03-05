package UF4.business;

public class ProductType
{
    private String name;
    private int id;
    private double price;
    private int stock;
    private boolean isOnSale;

    public ProductType(String name, int id, double price, int stock, boolean isOnSale)
    {
        this.name = name;
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.isOnSale = isOnSale;
    }
}
