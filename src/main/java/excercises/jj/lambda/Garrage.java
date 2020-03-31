package excercises.jj.lambda;

import excercises.jj.uml.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Garrage {


    public List<Vehicle> getGarage(){
    List<Vehicle> garage = new ArrayList<>();
    Random rand = new Random();
    int limit = 10;
    for(int i=0; i<50; i++){
        int wskaznik = rand.nextInt(limit);
        Vehicle vehicle;
        switch (wskaznik){
            case 0:
                vehicle = new Car();
                break;
            case 1:
                vehicle = new Plane();
                break;
            case 2:
                vehicle = new Ship();
                break;
            case 3:
                vehicle = new RaceCar();
                break;
            case 4:
                vehicle = new Truck();
                break;
            default:
                vehicle = new Vehicle();
                break;
        }
            garage.add(vehicle);
    }

    return garage;
    }

    static Predicate<Vehicle> getOnlyCars = v -> v instanceof Car;
    static Predicate<Vehicle> getOnlyTruckAndRaceCars = v -> v instanceof RaceCar || v instanceof Truck;
    static Predicate<Vehicle> getOnlyNonLandTransport = v -> v instanceof Plane || v instanceof Ship;

    static Comparator<Vehicle> getTheClassesAscending = Comparator.comparing(v -> v.getClass().getName());
}
