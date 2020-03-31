package excercises.jj.uml;

import lombok.Data;


@Data
public class Vehicle {

    private String name;

    public double getFuelNeeds(){
        return 0.0;
    }
    public double getDistance(){

        return 0.0;
    }
    public double calculateFuelConsumption(){
        return 0.0;
    }
    public void go(){

    }
    public void stop(){

    }

}
