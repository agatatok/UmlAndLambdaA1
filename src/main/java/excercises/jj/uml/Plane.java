package excercises.jj.uml;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Plane extends Vehicle implements Flying {


    public void takeOff() {

    }

    public void land() {

    }

    public void callAirControll() {

    }

    @Override
    public void go(){

    }
    @Override
    public void stop(){

    }
    @Override
    public double getFuelNeeds(){
        return 0.0;
    }
    @Override
    public double getDistance(){
        return  0.0;
    }

}
