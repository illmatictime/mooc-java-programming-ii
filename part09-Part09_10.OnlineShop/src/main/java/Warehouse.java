import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Warehouse(){
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product){
        for (String key : this.productPrice.keySet()){
            //System.out.println("key: " + key.contains(product));
            if(key.contains(product)){
                return this.productPrice.get(key);
            }
        }
        return -99;
    }

    public int stock(String product){
        // for (String key : this.productStock.keySet()){
        //     //System.out.println("key: " + key.contains(product));
        //     if(key.contains(product)){
        //         return this.productStock.get(key);
        //     }
        // }

        // if(this.productStock.keySet().contains(product)){
        //     return this.productStock.getOrDefault(product);
        // }
        // return 0;
        return this.productStock.getOrDefault(product, 0);
    }

    public boolean take(String product){
        if(this.productStock.keySet().contains(product) && this.productStock.get(product) > 0){
            this.productStock.put(product, this.productStock.getOrDefault(product, 0) -1);
            return true;
        }
        return false;
    }

    public Set<String> products(){
        Set<String> products = this.productStock.keySet();
        return products; 
    }
}
