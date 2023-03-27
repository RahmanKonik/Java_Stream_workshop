
import java.util.List;

class ShoppingCart {
    List<ShoppingArticle> articles;
    public ShoppingCart(List<ShoppingArticle> list) {
        articles = List.copyOf(list);
    }
}