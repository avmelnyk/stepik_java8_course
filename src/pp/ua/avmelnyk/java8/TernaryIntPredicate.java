package pp.ua.avmelnyk.java8;

@FunctionalInterface
public interface TernaryIntPredicate {
    boolean test(int a, int b, int c);
}
