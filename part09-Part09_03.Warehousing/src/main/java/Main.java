
public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        ChangeHistory ch = new ChangeHistory();
        ch.add(99);
        ch.average();
        System.out.println(ch.minValue());
        System.out.println(ch.maxValue());
        System.out.println(ch.average());
    }

}
