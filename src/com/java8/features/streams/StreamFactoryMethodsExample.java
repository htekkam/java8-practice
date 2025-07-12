package com.java8.features.streams;

import java.util.Random;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamFactoryMethodsExample {

	static UnaryOperator<Integer> add = x -> x+1;
	
	public static void main(String[] args) {
		
      Stream<Integer> iteratorStream = Stream.iterate(1, add).limit(11);
      iteratorStream.forEach(System.out::println);
      
      System.out.println("Generating random numbers with generate");
      
      Stream.generate(new Random()::nextInt).limit(11).forEach(System.out::println);
      
      System.out.println("Using Stream.of() method to generate values");
      
      Stream.of("hari","krishna","tekkam").map(s-> s.toUpperCase()).forEach(System.out::println);
	}

}
