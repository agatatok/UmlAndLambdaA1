package excercises.at.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.function.Predicate;


@Data
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public String eyeColor;

    static Predicate<Person> ifPersonGotBlueEyes = person -> person.getEyeColor().equals("blue");
    static Predicate<Person> ifFirstNameEndsWithA = person -> person.getFirstName().endsWith("a");
    static Predicate<Person> ifPersonIsAdult = person -> person.getAge()>=18;

    static Comparator<Person> sortByFirstName = Comparator.comparing(Person::getFirstName);
    static Comparator<Person> sortByLastName = Comparator.comparing(Person::getLastName);
    static Comparator<Person> sortByAge = Comparator.comparing(Person::getAge);
}
