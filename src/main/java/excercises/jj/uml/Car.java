package excercises.jj.uml;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car extends Vehicle {


    @Override
    public double getFuelNeeds(){
        return 0.0;
    }
    @Override
    public double getDistance(){
        return 0.0;
    }
}
