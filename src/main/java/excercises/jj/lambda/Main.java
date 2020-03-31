package excercises.jj.lambda;

import excercises.jj.uml.Car;
import excercises.jj.uml.Vehicle;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import static excercises.jj.lambda.Garrage.*;
import static excercises.jj.lambda.Person.*;

public class Main {

    public static void main(String[] args) {
        testGarageLambdasOperation();




        testPersonLambdasOperation();

        Kopiuj.runTestCopy();


    }

    private static void testPersonLambdasOperation() {
        System.out.println("---------------------------PERSON----------------------------------");
        List<Person> people = List.of(
                new Person("Janek", "Piwniczak",  23, true),
                new Person("Wlodzimierz", "ALojzy", 76, false),
                new Person("Anna", "Kochanna", 21, true),
                new Person("Almira", "Kaszmira", 45, false),
                new Person("Alfold", "Retlih", 130, false),
                new Person("Aldona", "WOlodyjowska", 57, false),
                new Person("RObert", "MArcinkiewicz", 31, true),
                new Person("Waldemar", "Chrzastek", 52, true));
        System.out.println(people);

        List<Person> peopleWithNameStartA = people
                .stream()
                .filter(nameStartWithA)
                .collect(Collectors.toList());
        System.out.println(peopleWithNameStartA);

        List<Person> peopleWithYInName = people
                .stream()
                .filter(nameHasY)
                .collect(Collectors.toList());
        System.out.println(peopleWithYInName);
        System.out.println("######################## \n SORTOWANIE");
        people
                .stream()
                .sorted(sortingByName)
                .forEach(System.out::println);

        System.out.println();

        people
                .stream()
                .sorted(sortingByHappiness.thenComparing(sortingByAge))
                .forEach(System.out::println);


        System.out.println();

        List<Person> lsitOfPeapleOver95OrderedByHappy = people
                .stream()
                .filter(isVeryOld)
                .sorted(sortingByHappiness)
                .collect(Collectors.toList());
        System.out.println(lsitOfPeapleOver95OrderedByHappy);
    }

    private static void testGarageLambdasOperation() {
        System.out.println("-------------------------------VEHICLE-----------------------------");
        //własna implementacja comparatorow i predikatow
        Garrage garrage = new Garrage();
        List<Vehicle> garage= garrage.getGarage();
        System.out.println(garage);

        List<Vehicle> classesSorted = garage
                .stream()
                .sorted(getTheClassesAscending)
                .collect(Collectors.toList());
        System.out.println(classesSorted+"\n");

        List<Vehicle> onlyCars = garage
                .stream()
                .filter(getOnlyCars)
                .collect(Collectors.toList());
        useGoMethod(onlyCars);
        System.out.println(onlyCars);

        List<Vehicle> trucksAndRaceCars = garage
                .stream()
                .filter(getOnlyTruckAndRaceCars)
                .collect(Collectors.toList());
        useGoMethod(trucksAndRaceCars);
        System.out.println(trucksAndRaceCars);

        List<Vehicle> shipsAndPlanes = garage
                .stream()
                .filter(getOnlyNonLandTransport)
                .collect(Collectors.toList());
        useGoMethod(shipsAndPlanes);
        System.out.println(shipsAndPlanes);
    }

    public static void useGoMethod(List<Vehicle> list){
        list
                .stream()
                .filter(getOnlyCars)
                .forEach(c -> c.go());
    }
}
