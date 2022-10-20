package ObjectOrientedProgramming.thisKeyword;

public class StudentNew {
    public String name;
    private final int rollNumber;

    public StudentNew(String name, int rollNumber){
        // data members = local variables
        // Accessing data members which has same name as a local variable with the help of 'this' keyword.
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public int getRollNumber(){
        return rollNumber;
    }
    public void print(){
        System.out.println(name + " : "+ rollNumber);
    }
}
