package excercises.al.uml;

public class Ship extends Vehicle implements Sailing {

    @Override
    public double getFuelNeeds() {
        return 1500;
    }

    @Override
    public double getDistance() {
        return 20001.3;
    }

    public void dock() {
        System.out.println("Ship is docking");
    }

    @Override
    public void stop() {
        System.out.println("Ship stopped");
    }
}
