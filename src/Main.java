import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person>queue = new LinkedList<>(generateClients());

        while(!queue.isEmpty()){
            Person personList = queue.poll();
            personList.tickets = personList.tickets -1;
            System.out.printf("%s %s прокатился(ась) на атракционе, осталось %d \n", personList.name, personList.surname, personList.tickets);
            if(personList.tickets > 0){
                queue.add(personList);
            }
        }
    }

    private static List<Person> generateClients(){
        ArrayList<Person> visitors = new ArrayList<>();
        Person person = new Person("Vasya", "Petrov", 3);
        Person person1 = new Person("Petya", "Gagarin", 5);
        Person person2 = new Person("Olya", "Koroleva", 1);
        Person person3 = new Person("Nastya", "Karpushina", 2);
        Person person4 = new Person("Kolya", "Nikolayev", 7);

        visitors.add(person);
        visitors.add(person1);
        visitors.add(person2);
        visitors.add(person3);
        visitors.add(person4);

        System.out.println(visitors.toString().replaceAll("^\\[|]", "").replaceAll(",", ""));

        return visitors;
    }
}