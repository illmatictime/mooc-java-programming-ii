import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        this.storageFacility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageFacility.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (!this.storageFacility.containsKey(storageUnit)) {
            return;
        }

        this.storageFacility.get(storageUnit).remove(item);

        if (this.storageFacility.get(storageUnit).isEmpty()) {
            this.storageFacility.remove(storageUnit);
        }

        System.out.println("removing: " + storageUnit + " " + item);
        System.out.println("storage facility: " + this.storageFacility);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>(this.storageFacility.keySet());
        return storageUnits;
    }
}
