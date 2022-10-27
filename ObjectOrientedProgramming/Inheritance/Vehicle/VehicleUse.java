package ObjectOrientedProgramming.Inheritance.Vehicle;

public class VehicleUse {
    public static void main(String[] args) {
        // parent class object
        Vehicle v = new Vehicle();
        v.color = "Black";
        v.setMaxSpeed(10);
        v.print(); // will print parent class(Vehicle) 'print' method.
        
        // child class 'car' object
        Car c = new Car();
        c.color = "Black";
        c.numGears = 10;
        c.setMaxSpeed(100);
        c.print(); // will print child class(Car) 'print' method. 
    }
}
