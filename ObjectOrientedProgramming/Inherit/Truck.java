package ObjectOrientedProgramming.Inherit;

import ObjectOrientedProgramming.Inheritance.Vehicle.Vehicle;

public class Truck extends Vehicle{
    int maxLoadingCapacity;

    public void print(){
        System.out.println("Truck color : " + color);
        System.out.println("Truck capacity : " + maxLoadingCapacity);

    }
}
