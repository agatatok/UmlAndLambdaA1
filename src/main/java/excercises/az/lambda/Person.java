package excercises.az.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Comparator;
import java.util.function.Predicate;

//2. Klasa Person
@Data
@AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Animal animal;

    //użycie lambd
    //3 x Predicate
    static Predicate<Person> firstNamesFromA = person -> person.getFirstName().toUpperCase().startsWith("A");
    static Predicate<Person> firstNamesEndingWithA = person -> person.getFirstName().toUpperCase().endsWith("A");
    static Predicate<Person> adultsOnly = person -> person.getAge() >= 18;
    static Predicate<Person> peopleWithDog = person -> person.getAnimal().getName().matches("Dog");

    //3 x Comparator
    static Comparator<Person> sortUsingFirstName = (person1, person2) -> person1
            .getFirstName()
            .compareTo(person2
                    .getFirstName());
    static Comparator<Person> sortUsingLastName = (person1, person2) -> person1
            .getLastName()
            .compareTo(person2
                    .getLastName());
    static Comparator<Person> sortUsingAnimalName = (person1, person2) -> person1
            .getAnimal()
            .getName()
            .compareTo(person2
                    .getAnimal()
                    .getName());
}
