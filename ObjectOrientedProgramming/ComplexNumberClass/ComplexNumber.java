package ObjectOrientedProgramming.ComplexNumberClass;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int r) {
        this.real = r;
    }

    public void setImaginary(int i) {
        this.imaginary = i;
    }

    public void print() {
        System.out.println(real + " " + "+" + " " + "i" + imaginary);
    }

    public void add(ComplexNumber c1, ComplexNumber c2) {
        c1.real = c1.real + c2.real;
        c1.imaginary = c1.imaginary + c2.imaginary;
        print();
    }

    public void multiply(ComplexNumber c2) {
        int x = (this.real * c2.real) - (this.imaginary * c2.imaginary);
        int y =  (this.real * c2.imaginary) + (this.imaginary * c2.real) ;
        real = x;
        imaginary = y;
        print();
    }

}
