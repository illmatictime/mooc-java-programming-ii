
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ladyluck = new Random();

        System.out.println("How many random numbers should be printed?");
        while (true) {
            String input = scanner.nextLine();

            if(input.equals("quit")){
                break;
            }

            int amount = Integer.valueOf(input);

            for (int i = 0; i < amount; i++) {
                int randomNumber = ladyluck.nextInt(11);
                System.out.println(randomNumber);
            }
            
        }
    }

}
