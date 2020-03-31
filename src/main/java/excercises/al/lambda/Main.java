package excercises.al.lambda;

import java.io.IOException;
import java.util.List;

import static excercises.al.lambda.FileCopier.startCopyingFile;
import static excercises.al.lambda.FileCopy.*;
import static excercises.al.lambda.Person.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> people = List.of(
                new Person("Ania", 25, true),
                new Person("Ola", 12, false),
                new Person("Ala", 12, true),
                new Person("Pola", 24, false),
                new Person("Basia", 19, true),
                new Person("Paula", 19, true)
        );

        System.out.println("People from list whose names starts with P: ");
        people
                .stream()
                .filter(nameStartsWithP)
                .forEach(System.out::println);

        System.out.println("\nPeople from list sorted by age, then by name: ");
        people
                .stream()
                .sorted(sortByAge
                        .thenComparing(sortByName))
                .forEach(System.out::println);

        System.out.println("\nPeople from list that are learning java sorted by age: ");
        people
                .stream()
                .filter(Person::isLearningJava)
                .sorted(sortByAge)
                .forEach(System.out::println);


        System.out.println("\nTime of copying files using IOStream:");
        startCopyingFile(useInputOutputStream, "sourceAL.txt", "targetIOAL.txt");

        System.out.println("Time of copying files using channels:");
        startCopyingFile(useChannels, "sourceAL.txt", "targetChannelsAL.txt");

        System.out.println("Time of copying files using Apache IO:");
        startCopyingFile(useApacheCommonsIO, "sourceAL.txt", "targetApacheAL.txt");


    }
}
