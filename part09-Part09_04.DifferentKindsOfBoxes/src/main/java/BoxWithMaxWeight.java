import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxCapacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxCapacity = capacity;
        items = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

    @Override
    public void add(Item item) {
        int totalWeight = item.getWeight();
        if (totalWeight + item.getWeight() > this.maxCapacity) {
            return;
        }

        this.items.add(item);
        // test
    }

}