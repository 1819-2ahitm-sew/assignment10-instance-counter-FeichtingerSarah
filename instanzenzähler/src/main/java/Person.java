public class Person {
    private String vorname;
    private String nachname;
    static int instanzen = 0;

    public static void main(String[] args) {
        Person person1 = new Person("Sarah", "Feichtinger");
        Person person2 = new Person("Anna", "Schätz");
        Person person3 = new Person("Daniela", "Plöchl");

        int instanzen = Person.instanzen;

        System.out.println("Es sind " + instanzen + " Personen angelegt worden");
    }

    public Person()
    {

    }

    public Person(String vorname, String nachname)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        instanzen++;
    }

}
