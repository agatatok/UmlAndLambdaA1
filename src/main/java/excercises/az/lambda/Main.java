package excercises.az.lambda;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import static excercises.az.lambda.FileCopying.useIOStream;
import static excercises.az.lambda.FileCopyingImpl.fileCopyingTime;
import static excercises.az.lambda.Person.*;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Person> listOfPeople = List.of(
                new Person("Gal", "Anonim", 100, new Animal("monkey", "Bailey")),
                new Person("Jan", "Paweł", 2, new Animal("donkey", "Shrek")),
                new Person("Maciek", "ZKlanu", 18, new Animal("dog", "Azor")));

        //Dowolne 3 przykłady na użycie Stream API z własnymi predykatami i komparatorami
        List<Person> peopleWithFirstNamesFromA = listOfPeople
                .stream()
                .filter(firstNamesFromA)
                .collect(Collectors.toList());

        List<Person> peopleWithFirstNamesBeginningAndEndingWithA = listOfPeople
                .stream()
                .filter(firstNamesFromA)
                .filter(firstNamesEndingWithA)
                .collect(Collectors
                        .toList());

        List<Person> onlyAdults = listOfPeople
                .stream()
                .filter(adultsOnly)
                .collect(Collectors
                        .toList());

        List<Person> sortedFirstNames = listOfPeople
                .stream()
                .sorted(sortUsingFirstName)
                .collect(Collectors
                        .toList());

        List<Person> sortedFullNames = listOfPeople
                .stream()
                .sorted(sortUsingLastName
                        .thenComparing(sortUsingFirstName))
                .collect(Collectors
                        .toList());

        List<Person> sortedUsingAnimalNameDescending = listOfPeople
                .stream()
                .sorted(sortUsingAnimalName
                        .reversed())
                .collect(Collectors
                        .toList());

        List<Person> adultsWithA = onlyAdults
                .stream().filter(firstNamesFromA)
                .filter(firstNamesEndingWithA)
                .collect(Collectors.toList());

        List<Person> adultsWithDog = onlyAdults
                .stream()
                .filter(peopleWithDog)
                .collect(Collectors
                        .toList());

        File src = new File("sourceAZ.txt");
        File trgt = new File("targetAZ.txt");

        double copyingTime = fileCopyingTime(useIOStream, src, trgt);
        System.out.println(copyingTime);
    }
}

