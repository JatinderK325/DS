package ObjectOrientedProgramming.Inheritance.Vehicle;

public class VehicleUse {
    public static void main(String[] args) {
        // parent class object
        Vehicle v = new Vehicle(200);
        v.color = "Black";
        v.setMaxSpeed(10);
        v.print(); // will print parent class(Vehicle) 'print' method.
        
        Vehicle v1 = new Car(10, 20); // eg of Polymorphism. Creating Vehicle pointing to Car because every Car is a Vehicle.
        
        // child class 'car' object
        Car c = new Car(10, 100);
        c.color = "Black";
        c.setMaxSpeed(100);
        c.print(); // will print child class(Car) 'print' method. 
    }
}
