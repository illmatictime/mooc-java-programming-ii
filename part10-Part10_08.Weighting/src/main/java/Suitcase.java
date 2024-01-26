
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public int totalWeight() {
        // int total = 0;
        // int index = 0;
        // while (index < this.Items.size()) {
        // total += this.Items.get(index).getWeight();
        // index++;
        // }
        // return total;
        return Items.stream()
                .map(x -> x.getWeight())
                .collect(Collectors.summingInt(Integer::intValue));

        // return this.Items.stream().mapToInt(t -> t.getWeight()).sum();

    }

    public void printItems() {
        // int index = 0;
        // while (index < this.Items.size()) {
        // Item t = this.Items.get(index);
        // System.out.println(t);
        // index++;
        // }
        Items.stream()
                .forEach(x -> System.out.println(x));
    }

    public Item heaviestItem() {
        if (this.Items.isEmpty()) {
            return null;
        }

        return this.Items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
