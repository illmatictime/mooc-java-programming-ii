import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    
    private List<Person> persons;

    public Employees(){
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        List<Person> list = new ArrayList<>();
    }

    public void print(){
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()){
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
        // this.persons.stream().forEach(person -> {
        //     System.out.println(person);
        // });
    }

    public void print(Education education){
        
        System.out.println(education);

    }
}
