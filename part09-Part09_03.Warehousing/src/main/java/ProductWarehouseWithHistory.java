public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        changeHistory.add(initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }
    
   @Override
    public double takeFromWarehouse(double amount){
        if(amount > super.getBalance()){
            return super.getBalance();
        }
        super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return super.getBalance();
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }
}
