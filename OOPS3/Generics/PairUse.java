package OOPS3.Generics;

public class PairUse {
    public static void main(String[] args) {
        Pair<String> p = new Pair<String>("ab", "cd");
        p.setFirst("abc");
        String str = p.getFirst();
        System.out.println(str);

        // Pair<int> p1 = new Pair<int>(1, 2); // error
        // because int is a primitive data type. <> inside of these, there should be object of class only. "Integer" is a class. 'int' == 'Integer'.
        // Integer a = 10; => Integer is a class and we are creating a object.
        // int i = a; 
        // we can't use primitive data types in generic.
        Pair<Integer> p1 = new Pair<Integer>(1, 2);
        Pair<Character> p2 = new Pair<>('d', 'f');

        // for every primitive, there is a class
        // int => Integer
        // char => Character
        // boolean => Boolean
    }
}
