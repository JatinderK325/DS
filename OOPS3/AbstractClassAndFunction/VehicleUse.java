package OOPS3.AbstractClassAndFunction;

public class VehicleUse {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); // abstract class cannot be initiated. Vehicle is a abstract class.
        // Vehicle v = new Car(); // abstract class cannot be initiated. Car is a abstract class.
        Vehicle v = new BMW();
        Car c = new BMW();
        BMW b = new BMW();
    }
}
