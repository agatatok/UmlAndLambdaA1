package excercises.jj.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.function.Predicate;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String lastName;
    private int age;
    private boolean isHappy;

    static Predicate<Person> nameStartWithA = p -> p.getName().toLowerCase().startsWith("a");
    static Predicate<Person> nameHasY = p -> p.getName().toLowerCase().contains("y");
    static Predicate<Person> isVeryOld = p -> p.getAge() > 95;

    static Comparator<Person> sortingByName = (p1, p2) -> p1.getName().compareTo(p2.getName());
    static Comparator<Person> sortingByAge = Comparator.comparing(Person::getAge);
    static Comparator<Person> sortingByHappiness = Comparator.comparing(Person::isHappy);

}
