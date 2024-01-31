import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees t = new Employees(); 
        ArrayList<Person> list = new ArrayList<>();
        list.add(("Arto", Education.PHD), ("a", Education.BA)); 
        list.add("Pekka", Education.HS); 
        t.add(list); 
        t.print(); 
    }
}
