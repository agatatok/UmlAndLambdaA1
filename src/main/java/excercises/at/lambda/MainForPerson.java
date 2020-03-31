package excercises.at.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class MainForPerson {
    public static void main(String[] args) {
        List<Person> people = generatePeopleList();
        usePredicateAndComparator(PredicateAndCompareInterface.useFirstPredAndCompar,people);
        System.out.println("________________________");
        usePredicateAndComparator(PredicateAndCompareInterface.useSecondPredAndCompar,people);
        System.out.println("________________________");
        usePredicateAndComparator(PredicateAndCompareInterface.useThirdPredAndCompar,people);
    }

    private static List<Person> generatePeopleList() {
        return List.of(
                new Person("Jan","Kowalski", 19, "green"),
                new Person("Adam", "Nowak", 15, "blue"),
                new Person("Barbara", "Mucha", 53, "grey"),
                new Person("Kacper","Chmielewski", 33, "green"),
                new Person("Wojciech","Szymański", 18, "blue"),
                new Person("Anna", "Kwiatkowska", 10, "brown"),
                new Person("Wiktoria","Kozłowska", 19, "green"),
                new Person("Barbara","Piasecka", 5, "blue"),
                new Person("Dominik","Gajewski", 42, "blue")
        );
    }

    private static void usePredicateAndComparator(PredicateAndCompareInterface predAndComp, List<Person> people) {
        predAndComp.filterAndSort(people)
                .forEach(System.out::println);
    }

}

