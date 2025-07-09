package com.java8.features.consumer;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Integer> equalTo = (input)-> input ==10;		
		Predicate<Integer> greaterThan = (input) -> input > 10;
		
		System.out.println("Is input == 10 ::"+equalTo.test(10));		
		System.out.println("Is input > 10 ::"+greaterThan.test(10));
		
		//combining two predicates  and printing final result
		
		boolean andResult = equalTo.and(greaterThan).test(100);
		System.out.println("Printing result with and operator::"+andResult);
		
		boolean orResult = equalTo.or(greaterThan).test(10);
		
		System.out.println("Printing result with or operator::"+orResult);

	}

}
