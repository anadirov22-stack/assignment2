import model.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Employee("Gulmira", "Bekbolatova", "Manager", 170000));
        persons.add(new Employee("Zhanar", "Ramazanova", "Developer", 345000));

        persons.add(new Student("Darkhan", "Malikov", 2.1));
        persons.add(new Student("Ali", "Nadirov", 3.2));

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