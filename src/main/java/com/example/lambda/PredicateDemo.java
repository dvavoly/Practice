package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect;
//        collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());

        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        collect = list.stream().filter(noGreaterThan5).toList();
        System.out.println(collect);
        
//        multiple filters
        collect = list.stream().filter(x -> x > 5 && x < 8).toList();
//        System.out.println(collect);
        
        Predicate<Integer> noLessThan8 = x -> x < 8;
        collect = list.stream().filter(noGreaterThan5.and(noLessThan8)).toList();
        System.out.println(collect);
        
        Predicate<Integer> lesserThan = i -> i < 10;
        System.out.println(lesserThan.test(9));
    }
}
