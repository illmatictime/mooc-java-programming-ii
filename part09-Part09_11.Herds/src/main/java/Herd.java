import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{

    private List<Movable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }


    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    @Override
    public String toString(){
        String myOutput = "";
        for (Movable movable : herd) {
            myOutput += movable.toString() + "\n";
        }
        return myOutput;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }
    
}
