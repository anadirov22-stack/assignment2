import model.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Employee("John", "Lennon", "Manager", 27045.78));
        persons.add(new Employee("George", "Harrison", "Developer", 50000.00));

        persons.add(new Student("Ringo", "Starr", 2.1));
        persons.add(new Student("Paul", "McCartney", 3.5));

        Collections.sort(persons);

        printData(persons);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.printf(
                    "%s earns %.2f tenge%n",
                    p.toString(),
                    p.getPaymentAmount()
            );
        }
    }
}