
import java.util.List;
import java.util.stream.Stream;


class Main {
    public static void main(String[] args) {

        ShoppingCart fruitCart = new ShoppingCart(
                List.of(
                        new ShoppingArticle("Orange", 1.5),
                        new ShoppingArticle("Apple", 1.7),
                        new ShoppingArticle("Banana", 2.2)));

       ShoppingCart vegetableCart  = new ShoppingCart(
                List.of(
                        new ShoppingArticle("Cucumber", 0.8),
                        new ShoppingArticle("Salad", 1.2),
                        new ShoppingArticle("Tomatoes", 2.7)));
        
        ShoppingCart meatAndFishCart = new ShoppingCart(
               List.of(
                        new ShoppingArticle("Cod", 40.2),

                        new ShoppingArticle("Beef", 29.1),
                        new ShoppingArticle("Salmon", 35.2)));

        double fruitCartSum = calculatePrice(fruitCart);
        System.out.println(String.format("FruitCartSum: %.2f", fruitCartSum));

        double vegetableCartSum = calculatePrice(vegetableCart);
        System.out.println(String.format("vegetableCartSum: %.2f",vegetableCartSum));

        double meatAndFishCartSum = calculatePrice(meatAndFishCart);
        System.out.println(String.format("meatAndCartSum: %.2f", meatAndFishCartSum));


        double totalSum = calculatePrice(fruitCart, vegetableCart, meatAndFishCart);
        System.out.println(String.format("Sum: %.2f", totalSum));

    }


   private static double calculatePrice(ShoppingCart shoppingCart){

        return Stream.of(shoppingCart)
                .flatMap((cart)-> {
                return cart.articles.stream();
               })

               .mapToDouble((item)-> {
                return item.getPrice();
               })

               .sum();

    }

    private static double calculatePrice(ShoppingCart... carts){

        return Stream.of(carts)
                .flatMap((cart)-> {
                return cart.articles.stream();
               })

               .mapToDouble((item)-> {
                return item.getPrice();
               })

               .sum();

    }
}