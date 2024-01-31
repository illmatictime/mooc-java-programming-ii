import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    
    private List<Person> employee;

    public Employees(){
        this.employee = new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.employee.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(person -> Employees.this.add(peopleToAdd));
    }

    public void print(){
        Iterator<Person> iterator = employee.iterator();

        while (iterator.hasNext()){
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }

    }

    public void print(Education education){
        Iterator<Person> iterator = employee.iterator();

        while (iterator.hasNext()){
            Person nextInLine = iterator.next();
            if(nextInLine.getEducation() == education){
                System.out.println(nextInLine);
            }
            
        }
    }
}
