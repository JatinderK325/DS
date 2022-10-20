package ObjectOrientedProgramming.staticKeyword;

public class StudentNew {
    public String name;
    private final int rollNumber;
    // data which is shared by everyone so dependent on the class not on the objects.
    static int numStudents;

    public StudentNew(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++; // when object is created, constructor is called and hence, numStudents is increased by 1.
    }
    public static int getNumStudents(){
        return numStudents;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void print(){
        System.out.println(name + " : "+ rollNumber);
    }
}
