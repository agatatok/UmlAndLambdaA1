package excercises.az.uml;

public class Vehicle {
    private String name;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public double getFuelNeeds() {
        return 0.0;
    }

    public double getDistance() {
        return 0.0;
    }

    public double getFuelConsumption() {
        return 0.0;
    }

    public void go() {
        System.out.println("The vehicle is moving at the moment.");
    }

    public void stop() {
        System.out.println("The vehicle has just stopped.");
    }
}
