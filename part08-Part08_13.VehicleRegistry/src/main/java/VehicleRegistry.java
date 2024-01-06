import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry(){
        this.owners = new HashMap<>();
    }
    

    public boolean add(LicensePlate licensePlate, String owner){
        if(owners.values() == null){
            owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        if(owners.values() == null){
            return null;
        }
        return owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        return true;
    }

    public void printLicensePlates(){
        
    }

    public void printOwners(){
        System.out.println(this.owners.values());
    }
}
