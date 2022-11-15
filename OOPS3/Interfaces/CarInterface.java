package OOPS3.Interfaces;

public interface CarInterface extends VehicleInterface {
    // One interface can extend other interface, not implement.
    public String getCompany();
}