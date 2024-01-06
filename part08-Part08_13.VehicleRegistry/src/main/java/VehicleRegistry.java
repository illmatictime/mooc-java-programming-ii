import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!owners.containsKey(licensePlate)) {
            owners.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (!owners.containsKey(licensePlate)) {
            return null;
        }
        return owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        String exist = owners.remove(licensePlate);
        if (exist == null) {
            return false;
        }
        return true;
    }

    public void printLicensePlates() {
        Set<LicensePlate> allPlates = this.owners.keySet();
        for (LicensePlate allThePlates : allPlates) {
            System.out.println(allThePlates);
        }
    }

    public void printOwners() {
        // String[] anOwner = new HashSet<String>(this.owners.values()).toArray(new
        // String[0]);
        Set<String> uniqueOwners = new HashSet<String>(this.owners.values());
        for (String string : uniqueOwners) {
            System.out.println(string);
        }
    }
}
