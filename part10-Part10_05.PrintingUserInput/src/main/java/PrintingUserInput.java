
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.isEmpty()) {
                break;
            }
            input.add(row);
        }

        input.stream()
                .forEach(x -> System.out.println(x));
    }

}
