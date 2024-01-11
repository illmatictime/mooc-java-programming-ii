import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> productHistory;

    public ChangeHistory() {
        this.productHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.productHistory.add(status);
    }

    public void clear() {
        this.productHistory.clear();
    }

    public String toString() {
        return productHistory.toString();
    }

    public double maxValue() {
        if (productHistory.isEmpty()) {
            return 0;
        }
        double maxValue = productHistory.get(0);
        for (Double temp : productHistory) {
            if (maxValue < temp) {
                maxValue = temp;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (productHistory.isEmpty()) {
            return 0;
        }
        double minValue = productHistory.get(0);
        for (Double temp : productHistory) {
            if (minValue > temp) {
                minValue = temp;
            }
        }
        return minValue;
    }

    public double average() {
        if (productHistory.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Double temp : productHistory) {
            total = total + temp;
            System.out.println("total: " + total);
        }
        return total / productHistory.size();
    }
}
