package ObjectOrientedProgramming.finalKeyword;

public class StudentNew {
    public String name;
    private final int rollNumber;
    // final data members can be initialized as soon as they are declared.
    //private final int rollNumber = 10;

    public StudentNew(String n, int rn){
        name = n;
        rollNumber = rn;
    }
    // public StudentNew(String n){
    //     name = n;
    //     rollNumber = 100;
    // }

    // not possible becoz roll number is final, only can be set in constructors or while initialization.
    /*  public void setRollNumber(int rn){
        if(rn <=0 ){
            return;
        }
        rollNumber = rn;
    }
    */

    public int getRollNumber(){
        return rollNumber;
    }
    public void print(){
        System.out.println(name + " : "+ rollNumber);
    }
}
