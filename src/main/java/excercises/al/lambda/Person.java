package excercises.al.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Comparator;
import java.util.function.Predicate;

@Data
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private int age;
    private boolean isLearningJava;

    static Predicate<Person> nameStartsWithP = person -> person.getName().toUpperCase().startsWith("P");
    static Predicate<Person> ageOver18 = person -> person.getAge() > 18;
    static Predicate<Person> isLearningJva = person -> person.isLearningJava;

    static Comparator<Person> sortByName = Comparator.comparing(Person::getName);
    static Comparator<Person> sortByAge = Comparator.comparing(Person::getAge);
    static Comparator<Person> sortByLearningJava = Comparator.comparing(Person::isLearningJava);
}
