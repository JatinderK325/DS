package OOPS3.Generics.BoundGenericsTypes;

import OOPS3.AbstractClassAndFunction.Vehicle;

public class Print {
    // 1. case1: No bound. we can't call 'print' always.
    // 2. case2: We can bind what kind of T will get accepted here so <T extends Vehicle>. Hence, only Vehicle's subclasses. so can call 'print' but very restrictive. 
    // 3. case3: only classes which implement 'PrintInterface'.
    // we can write only 'extends' when we are binding generics whether it is class or interface.
    public static <T extends PrintInterface> void printArray(T a[]){
        for (int i = 0; i < a.length; i++) {
            a[i].print();
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student s[] = new Student[10];
        for (int i = 0; i < 10; i++) {
            s[i] = new Student();
        }
        printArray(s);
    }
}
 