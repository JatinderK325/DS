package OOPS3.Generics.GenericsFunctions;

public class Print {
    // generic type function hence we can print array of any data type.
    public static <T> void printArray(T a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer a[] = new Integer[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i + 1;
        }
        printArray(a);

        String s[] = new String[10];
        for (int i = 0; i < 10; i++) {
            s[i] = "abc";
        }
        printArray(s);
    }
}
 