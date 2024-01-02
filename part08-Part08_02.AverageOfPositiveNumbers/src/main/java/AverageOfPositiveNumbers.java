
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            int sum = 0;

            while (true) {
                int input = Integer.valueOf(scanner.nextLine());

                if (input == 0) {
                    break;
                } else if (input > 0) {
                    sum += input;
                    count++;
                }

            }

            if (count < 1) {
                System.out.println("Cannot calculate the average");
            } else {
                System.out.println(1.0 * sum / count);
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
