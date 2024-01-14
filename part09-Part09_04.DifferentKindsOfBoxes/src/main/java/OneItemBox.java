import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> oneItem;

    public OneItemBox() {
        this.oneItem = new ArrayList<>();
        System.out.println(oneItem.size());
    }

    @Override
    public void add(Item item) {
        if (this.oneItem.size() > 0) {
            return;
        }
        this.oneItem.add(item);
        System.out.println(oneItem);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.oneItem.contains(item);
    }

}
