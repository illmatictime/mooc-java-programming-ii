import java.util.Scanner;

public class UserInterface {
    
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if(command.equals("stop")){
                break;
            }
            commandMenu(command);
        }
    }

    private void commandMenu(String command) {
        if(command.equals("add")){
            addTask();
        }else if(command.equals("list")){
            listTasks();
        }else if(command.equals("remove")){
            removeTask();
        }else{
            System.out.println("Unknown command");
        }
    }

    private void addTask(){
        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        this.todoList.add(task);
    }

    private void listTasks(){
        this.todoList.print();
    }

    private void removeTask(){
        System.out.print("Which one is remove? ");
        int removeTask = Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(removeTask);
    }
    
}
