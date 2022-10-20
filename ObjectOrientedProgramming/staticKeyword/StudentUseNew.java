package ObjectOrientedProgramming.staticKeyword;

public class StudentUseNew {
    public static void main(String[] args) {
        StudentNew s1 = new StudentNew("Arsh", 12);
        s1.print();
        StudentNew s2 = new StudentNew("Rupinder", 13);
        s2.print();
        System.out.println(StudentNew.getNumStudents());
    }
}
