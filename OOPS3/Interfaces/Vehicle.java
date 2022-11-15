package OOPS3.Interfaces;

public class Vehicle implements VehicleInterface {
    // class cannot extend interface, it implements.
    // If a class implements an interface, either it should declare all the methods of an interface OR should be declared itself as abstract.
    @Override
    public int getMaxSpeed() {
        return 10;
    }

    @Override
    public void print() {
        System.out.println("Hello");
    }

}
