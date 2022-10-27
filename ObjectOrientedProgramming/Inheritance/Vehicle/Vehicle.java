package ObjectOrientedProgramming.Inheritance.Vehicle;

public class Vehicle {
    // protected means within the package but also accessible in the other package if we have sub class in that package.
    protected String color;
    private int maxSpeed;
    
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void print(){
        System.out.println("Vehicle color : " + color);
        System.out.println("Vehicle speed : " + maxSpeed);
    }

}

// Order
// public(access everywhere) > protected(within the package but can be accessible in other package if that package contains sub class) > default(within the package only) > private(within the class only)