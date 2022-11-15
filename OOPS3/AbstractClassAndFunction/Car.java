package OOPS3.AbstractClassAndFunction;

public abstract class Car extends Vehicle {
// Car is extending a abstract class i.e Vehicle so either we need to override all the functions that Vehicle has implemented or we need to declare Car as abstract as well.

// Here Car's parent class 'Vehicle' class has two methods:
// 1. public abstract boolean isMotorized(); 2. public abstract String getCompany(); 
// Here in this class we just implemented only one function of parent class therefore we needed to declare 'Car' as abstract too. But if we implement both the functions of parent class here, we do'nt need to declare 'Car' as a abstract.
    @Override
    public boolean isMotorized() {
        return false;
    }
}
