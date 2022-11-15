package OOPS3.Generics.GenericsCase3;

public class PairUse {
    public static void main(String[] args) {
        // when we have pair inside pair:
        // like: pair = 1. pair<Integer, Integer> 2. Integer

        int a = 10;
        int b = 30;
        int c = 23;

        Pair<Integer, Integer> internalPair = new Pair<>(a, b);
        Pair<Pair<Integer, Integer>, Integer> p = new Pair<>(internalPair, c);
        // internalPair.setFirst(12);
        // internalPair.setSecond(13);
        // p.setSecond(32);
        System.out.println(p.getSecond()); // output = 23
        System.out.println(p.getFirst().getFirst()); // output = 10
        System.out.println(p.getFirst().getSecond()); // output = 30

    }
}
