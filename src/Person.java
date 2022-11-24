public class Person {
    protected String name;

    protected String surname;

    protected int tickets;

    protected Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public String toString(){
        return name + " " + surname + ": " + tickets + " билет(а/ов) \n";
    }
}
