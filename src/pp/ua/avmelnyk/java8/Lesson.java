package pp.ua.avmelnyk.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

//2.1 - 2.6 practice lessons
public class Lesson {

    public static void main(String[] args) {
        //2.2
        Function<Long, Long> nextEven = x -> x % 2 == 0 ? x + 2 : x + 1;
        /*System.out.println(nextEven.apply(123l));
        System.out.println(nextEven.apply(124l));*/

        //2.3
        BiFunction<String, String, String> toManyArgs = (a, b) -> (a + b).toUpperCase();
//        System.out.println(toManyArgs.apply("hello,", "it`s me"));

        //2.4
        BiFunction<Long, Long, Long> getProduction = (left_b, right_b) -> {
            if (left_b.equals(right_b)) {
                return left_b;
            } else {
                Long prod =1L;
                while(left_b<=right_b){
                    prod*=left_b;
                    left_b++;
                }
                return prod;
            }
        };
        //System.out.println(getProduction.apply(1L, 4L));


        //2.5
        Function<List<String>,List<String>> getDistictStrings = (x) -> new ArrayList<>(new HashSet<>(x));
        ArrayList<String>listOF = new ArrayList<String>();
        listOF.add("java");
        listOF.add("scala");
        listOF.add("java");
        listOF.add("closure");
        listOF.add("scala");
        List<String>result = getDistictStrings.apply(listOF);
        result.forEach(System.out::println);


        //2.6

    }







}