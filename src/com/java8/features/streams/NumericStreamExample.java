package com.java8.features.streams;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamExample {
	
	public static void main(String[] args) {
		
		System.out.println("Calculating sum of integers with stream");
		
		Optional<Integer> reduce = Stream.of(1,2,3,4,5,6).reduce((a,b) -> a+b);
		
		int sum = reduce.isPresent() ? reduce.get():0;
		System.out.println(sum);
		
		System.out.println("Calculating sum  of integers with IntStream");
		
		int sumUsingIntStream = IntStream.rangeClosed(1, 6).sum();
		
		System.out.println(sumUsingIntStream);
	}

}
