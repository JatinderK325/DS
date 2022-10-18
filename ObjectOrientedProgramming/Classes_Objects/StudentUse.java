package ObjectOrientedProgramming.Classes_Objects;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Arsh";
        s1.setRollNumber(12);

        Student s2 = new Student();
        s2.name = "Rupinder";
        s2.setRollNumber(13);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.getRollNumber());
        System.out.println(s2.getRollNumber());
    }
}
