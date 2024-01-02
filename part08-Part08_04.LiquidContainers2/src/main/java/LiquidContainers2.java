
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Container container0 = new Container();
            Container container1 = new Container();

            while (true) {
                System.out.println("> ");
                System.out.println("First: " + container0);
                System.out.println("Second: " + container1);

                String input = scan.nextLine();
                if (input.equals("quit")) {
                    break;
                }

                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if(command.equals("add") && amount>0){
                    container0.add(amount);
                }else if(command.equals("move") && amount>0){
                    if(container0.contains()>=amount){
                        container1.add(amount);
                        container0.remove(amount);;
                    }else if(amount>container0.contains()){
                        container1.add(container0.contains());;
                        container0.remove(amount);;    
                    }
                    if(container1.contains() >= 100){
                        container1.add(amount);;
                    }

                }else if(command.equals("remove") && amount>0){
                    container1.remove(amount);
                }

            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}