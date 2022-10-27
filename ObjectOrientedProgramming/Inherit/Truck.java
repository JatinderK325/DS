package ObjectOrientedProgramming.Inherit;

import ObjectOrientedProgramming.Inheritance.Vehicle.Vehicle;

public class Truck extends Vehicle{
    int maxLoadingCapacity;

    public Truck(int maxSpeed){
        super(maxSpeed);
    }
    public void print(){
        System.out.println("Truck color : " + color);
        System.out.println("Truck capacity : " + maxLoadingCapacity);

    }
}
