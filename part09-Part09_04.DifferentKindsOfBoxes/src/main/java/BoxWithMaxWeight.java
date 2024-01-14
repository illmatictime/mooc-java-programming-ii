import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        items = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

    @Override
    public void add(Item item) {
        if (totalWeight() + item.getWeight() > this.maxWeight) {
            return;
        }
        this.items.add(item);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item weight : items) {
            totalWeight += weight.getWeight();
        }
        return totalWeight;
    }
}
