package excercises.jj.uml;

import lombok.AllArgsConstructor;



@AllArgsConstructor
public class Truck extends Car {

    @Override
    public double getFuelNeeds(){
        return 0.0;
    }
}
