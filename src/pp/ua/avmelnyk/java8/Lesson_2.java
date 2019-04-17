package pp.ua.avmelnyk.java8;

public class Lesson_2 {
    public static void main(String[] args) {
        //2.10
        TernaryIntPredicate allValuesAreDifferentPredicate=(a, b, c) -> a!=b&b!=c&a!=c;
        System.out.println(allValuesAreDifferentPredicate.test(1, 1, 1));
        System.out.println(allValuesAreDifferentPredicate.test(1, 2, 3));
    }
}
