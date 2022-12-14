package ObjectOrientedProgramming.Inheritance.Vehicle;

public class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    public Car(int numGears, int maxSpeed){
        super(maxSpeed);
        this.numGears = numGears;
    }

    public void print(){
        // System.out.println("Car color : " + color);
        // System.out.println("Car speed : " + getMaxSpeed());
        // instead of above two lines, we can write like this:
        super.print(); // getting parent class's properties 
        // super is a parent object.
        print(); // will call child class print fn
        System.out.println("Car numGears : " + numGears);
        System.out.println("Car isConvertible : " + isConvertible);
    }
}
