package pl.javastart.task;

// import jdk.incubator.vector.VectorOperators;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = new Person("Anna", "Nowak");
        Task task1 = new Task("Zakupy", person1, 0);
        Task task2 = new Task("Sprzątanie", person1, 5);
        Task task3 = new Task("Przygotowanie obiadu", person2, -2);

        task1.outPrint();
        System.out.println("Czy zadanie ma najwyższy priorytet? " + task1.highPriority());
        System.out.println("Czy zadanie ma średni priorytet? " + task1.mediumPriority());
        System.out.println("Czy zadanie ma niski priorytet? " + task1.lowPriority());

        task2.outPrint();
        task3.outPrint();
    }
}
