package excercises.al.uml;

public class Plane extends Vehicle implements Flying {

    @Override
    public double getFuelNeeds() {
        return 1300.3;
    }

    @Override
    public double getDistance() {
        return 15000;
    }

    public void takeOff() {
        System.out.println("Plane takes off");
    }

    public void land() {
        System.out.println("Plane is landing");
    }

    public void callAirControl() {
        System.out.println("Air control, do you copy me?");
    }

    @Override
    public void go() {
        System.out.println("Plane started!");
    }

    @Override
    public void stop() {
        System.out.println("Plane stopped");
    }
}
