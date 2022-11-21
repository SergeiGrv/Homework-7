import java.util.List;

public class Main {
    public static void main(String[] args) {
        generateClients();
    }

    private static List<Person> generateClients(){
        Person person = new Person("Vasya", "Petrov", 3);
        Person person1 = new Person("Petya", "Gagarin", 5);
        Person person2 = new Person("Olya", "Koroleva", 1);
        Person person3 = new Person("Nastya", "Karpushina", 2);
        Person person4 = new Person("Kolya", "Nikolayev", 31);
        Person person5 = new Person("Tanya", "Linchburger", 7);

    }
}