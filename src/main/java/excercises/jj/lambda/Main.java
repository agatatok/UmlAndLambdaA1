package excercises.jj.lambda;

import excercises.jj.uml.Car;
import excercises.jj.uml.Vehicle;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import static excercises.jj.lambda.Garrage.*;

public class Main {

    public static void main(String[] args) {
        Garrage garrage = new Garrage();
        List<Vehicle> garage= garrage.getGarage();
        System.out.println(garage);

        List<Vehicle> onlyCars = garage
                .stream()
                .filter(getOnlyCars)
                //.forEach(c -> c.setName("Car"))
                .collect(Collectors.toList());
        System.out.println(onlyCars);

        List<Vehicle> trucksAndRaceCars = garage
                .stream()
                .filter(getOnlyTruckAndRaceCars)
                .collect(Collectors.toList());
        System.out.println(trucksAndRaceCars);

        List<Vehicle> shipsAndPlanes = garage
                .stream()
                .filter(getOnlyNonLandTransport)
                .collect(Collectors.toList());
        System.out.println(shipsAndPlanes);



    }
    public static void useSpecialMethod(List<Vehicle> list){
        list
                .stream()
                .filter(getOnlyCars)
                .map(c -> c.getFuelNeeds())
                .forEach(System.out::println);
    }
}
