
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> input = new ArrayList<>();

            System.out.println("Input numbers, type \"end\" to stop.");
            while (true) {
                String row = scanner.nextLine();
                if(row.equals("end")){
                    System.out.println("");
                    break;
                }

                input.add(row);
                //input.add(Integer.valueOf(read));
            }
            


            double averageOfNegativeNumbers = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
            
            double averageOfPositiveNumbers = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number >= 0)
                .average()
                .getAsDouble();

            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            String option = scanner.nextLine();

            if(option.equals("n")){
                System.out.println("Average of the negative numbers: " + averageOfNegativeNumbers);
            }else if(option.equals("p")){
                System.out.println("Average of the positive numbers: " + averageOfPositiveNumbers);
            }
        }

    }
}
