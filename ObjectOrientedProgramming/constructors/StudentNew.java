package ObjectOrientedProgramming.constructors;

public class StudentNew {
    public String name;
    private int rollNumber;
    // constructor
    // public StudentNew(){
    //     rollNumber = 1000;
    // }
    public StudentNew(String n, int rn){
        name = n;
        rollNumber = rn;
    }
    public StudentNew(String n){
        name = n;
    }

    public void setRollNumber(int rn){
        if(rn <=0 ){
            return;
        }
        rollNumber = rn;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void print(){
        System.out.println(name + " : "+ rollNumber);
    }
}
