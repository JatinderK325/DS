package ObjectOrientedProgramming.ComplexNumberClass;

public class ComplexNumberUse {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 5);
        c1.print();

        ComplexNumber c2 = new ComplexNumber(6, 7);
        c1.add(c1, c2);
        c1.multiply(c2);

    }
}
