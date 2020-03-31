package excercises.az.uml;

public class Ship extends Vehicle implements Sailing {
    public void dock() {
        System.out.println("Ship has just gone to the dock");
    }

    @Override
    public double getFuelNeeds() {
        return 0.0;
    }

    @Override
    public double getDistance() {
        return 0.0;
    }

    @Override
    public void stop() {
        System.out.println("The ship has just stopped.");
    }
}
