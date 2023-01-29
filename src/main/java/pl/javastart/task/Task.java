package pl.javastart.task;

public class Task {

    String title;
    Person person;
    int priority;

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
        boolean result;
        if (this.priority <= 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    boolean lowPriority() {
        boolean result;
        if (this.priority >= 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    boolean mediumPriority() {
        boolean result;
        if (this.priority != 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    void outPrint() {
        System.out.println("\nAktualne zadanie");
        System.out.printf("Nazwa zadania: %s\nOsoba odpowiedzialna: %s %s\n", this.title, this.person.getFirstName(), this.person.getLastName());
        System.out.printf("Priorytet zadania: %d\n", this.priority);
    }
}
