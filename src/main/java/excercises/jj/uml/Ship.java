package excercises.jj.uml;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Ship extends Vehicle implements Sailling {
    public void dock() {

    }
    @Override
    public double getFuelNeeds(){
        return 0.0;
    }

    @Override
    public double getDistance(){
        return 0.0;
    }
    @Override
    public void stop(){

    }
}
