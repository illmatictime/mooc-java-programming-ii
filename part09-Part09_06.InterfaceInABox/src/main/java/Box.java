import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> packable;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.packable = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() >= this.maxCapacity) {
            return;
        }
        this.packable.add(packable);
    }

    @Override
    public double weight() {
        double totalWeight = 0;

        for (Packable weight : packable) {
            totalWeight += weight.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + packable.size() + " items, total weight " + weight() + " kg";
    }

}
