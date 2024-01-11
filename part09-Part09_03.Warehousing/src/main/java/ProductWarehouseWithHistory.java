public class ProductWarehouseWithHistory extends ProductWarehouse {

    private double initialBalance;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.initialBalance = super.getBalance();
    }

    public String history() {

        return System.out.println(super.getBalance());
    }
}
