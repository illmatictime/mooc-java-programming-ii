import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if(this.shoppingCart.keySet().contains(product)){
            this.shoppingCart.get(product).increaseQuantity();
        }else{
            this.shoppingCart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int totalShoppingCartPrice = 0;
        for (Item oneItemPrice : this.shoppingCart.values()) {
            totalShoppingCartPrice += oneItemPrice.price();
        }
        return totalShoppingCartPrice;
    }

    public void print() {
        for (Item oneItemPrice : this.shoppingCart.values()) {
            System.out.println(oneItemPrice);
        }
    }
}