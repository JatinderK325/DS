package OOPS3.Interfaces;

public class Car extends Vehicle2 implements VehicleInterface, CarInterface {
    // class can extend only one class at a time but can implemented multiple interfaces. Either it should declare all the methods of an interface OR should be declared itself as abstract.
    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void print() {

    }

    @Override
    public String getCompany() {
        return null;
    }

}
