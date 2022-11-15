package OOPS3.Generics.GenericsCase2;

public class PairUse {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<Integer, String>(3, "cd");
        p.setFirst(7);
        int i = p.getFirst();
        System.out.println(i);

        Pair<Character, Character> p2 = new Pair<>('c', 'd');

    }
}
