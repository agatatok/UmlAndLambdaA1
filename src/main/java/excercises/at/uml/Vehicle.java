package excercises.at.uml;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {
    private String name;

    public double getFuelNeeds(){
        return 7.0;
    }
    public double getDistance(){
        return 50.0;
    }
    public double calculateFuelConsumption(){
        return getFuelNeeds()/getDistance();
    }
    public void go(){
        System.out.println("Going..");
    }
    public void stop(){
        System.out.println("Stop!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
