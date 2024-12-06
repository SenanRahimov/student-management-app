package Task10;

public class Car extends Vehicle implements Drivable {

    @Override
    public void accelerate() {
        System.out.println("Accelerating the car ");
    }

    @Override
    public void brake() {
        System.out.println("The car is braking.");

    }
}
