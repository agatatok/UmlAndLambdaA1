package excercises.at.uml;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    public void dock() {
        System.out.println("Docking..");
    }

    @Override
    public double getFuelNeeds() {
        return 4.0;
    }

    @Override
    public double getDistance() {
        return 20.0;
    }

    @Override
    public void stop() {
        System.out.println("Stop the boat!");
    }
}
