package pl.javastart.task;

public class Task {

    private String title;
    private Person person;
    private int priority;

    public Task() {
    }

    public Task(String title) {
        this.title = title;
    }

    public Task(String title, Person person) {
        this(title);
        this.person = person;
    }

    public Task(String title, Person person, int priority) {
        this(title, person);
        this.priority = priority;
    }

    boolean highPriority() {
        return (this.priority > 0);
    }

    boolean lowPriority() {
        return (this.priority < 0);
    }

    boolean mediumPriority() {
        return (this.priority == 0);
    }

    void printInfo() {
        System.out.println("\nAktualne zadanie");
        System.out.printf("Nazwa zadania: %s\nOsoba odpowiedzialna: %s %s\n", this.title, this.person.getFirstName(), this.person.getLastName());
        System.out.printf("Priorytet zadania: %d\n", this.priority);
    }
}
