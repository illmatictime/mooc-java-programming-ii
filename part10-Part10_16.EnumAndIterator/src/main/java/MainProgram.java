import java.util.ArrayList;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) {
        List<Person> Persont = new ArrayList<>();
        Persont.add(new Person("Arto", Education.PHD));
        Persont.add(new Person("Pekka", Education.MA));
        Employees tt = new Employees();
        tt.add(Persont);
        tt.print(Education.PHD);
    }
}
