
public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        // ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        // juice.takeFromWarehouse(11.3);
        // juice.addToWarehouse(1.0);
        // //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
        
        // juice.printAnalysis();
        // Is printAnalysis() working correctly? Running the code:
        // ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee", 10, 2);
        // pwh.addToWarehouse(4);
        // pwh.takeFromWarehouse(2);
        // pwh.printAnalysis();
        //prints the line "History: [2.0, 6.0, 6.0]"
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
        
        juice.printAnalysis(); 
        // expected:<...6.0, 7.0, 8.0, 9.0, [6.0, 3.0, 0].0]> 
        // but was:<...6.0, 7.0, 8.0, 9.0, [9.0, 9.0, 9].0]>
    }
}
