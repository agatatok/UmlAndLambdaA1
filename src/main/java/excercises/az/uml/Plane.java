package excercises.az.uml;

public class Plane extends Vehicle implements Flying {
    public void takeOff() {
        System.out.println("The plane has just taken off.");
    }

    public void land() {
        System.out.println("The Eagle has landed.");
    }

    public void callAirControl() {
        System.out.println("Help!");
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
    public void go() {
        System.out.println("The plane is moving at the moment.");
    }

    @Override
    public void stop() {
        System.out.println("The plane has just stopped.");
    }
}
