package excercises.al.uml;

public abstract class Vehicle {
    private String name;

    public abstract double getFuelNeeds();

    public abstract double getDistance();

    public double calculateFuelConsumption() {
        return getFuelNeeds() / getDistance();
    }

    public void go() {
        System.out.println("Vehicle started!");
    }

    public void stop() {
        System.out.println("Vehicle stopped!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
