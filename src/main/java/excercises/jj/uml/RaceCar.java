package excercises.jj.uml;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RaceCar extends Car {

    @Override
    public double getFuelNeeds(){
        return 0.0;
    }
}
