package ObjectOrientedProgramming.Classes_Objects;

public class Student {
    // Public: Anywhere
    // Private: only within the same class
    // Default (_String name): within the package
    public String name;
    private int rollNumber;

    public void setRollNumber(int rn){
        if(rn <=0 ){
            return;
        }
        rollNumber = rn;
    }
    public int getRollNumber(){
        return rollNumber;
    }
}
