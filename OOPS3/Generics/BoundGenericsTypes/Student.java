package OOPS3.Generics.BoundGenericsTypes;

public class Student implements PrintInterface {
    int rollNumber;

    @Override
    public void print() {
        System.out.println(rollNumber);
    }

}
