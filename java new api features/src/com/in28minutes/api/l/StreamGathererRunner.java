//package com.in28minutes.api.l;
//
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//import java.util.stream.Gatherers;
//
//public class StreamGathererRunner {
//
//    private static void fold() {
//        Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
// //fold-combining all the numbers
//
//        numbers.gather(Gatherers.fold(() -> 0, (sum, i) -> sum + i))
//            .forEach(System.out::println);  // prints 210
//    }
//
//    public static void main(String[] args) {
//        fold();
//    }
//}
