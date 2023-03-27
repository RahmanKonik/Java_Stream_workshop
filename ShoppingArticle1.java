
public class ShoppingArticle1 {
    private String name;
    private String category;
    private double price;
    private String unit;

    public ShoppingArticle1(String name, String category, double price, String unit) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return name + " (" + category + ")";
    }
}