package excercises.at.uml;

public class Plane extends Vehicle implements Flying {

    public Plane(String name) {
        super(name);
    }

    public void takeOff() {
        System.out.println("Taking off..");
    }

    public void land() {
        System.out.println("Landing..");
    }

    public void callAirControl() {
        System.out.println("Calling air control..");
    }
}
