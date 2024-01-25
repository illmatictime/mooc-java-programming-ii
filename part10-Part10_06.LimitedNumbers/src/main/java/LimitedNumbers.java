
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();

        while(true){
            int row = Integer.valueOf(scanner.nextLine());
            if(row < 0){
                break;
            }
            input.add(row);
        }

        input.stream()
            .filter(x -> x >= 1 & x <= 5)
            .forEach(x -> System.out.println(x));

    }
}
