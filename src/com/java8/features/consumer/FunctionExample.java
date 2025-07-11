package com.java8.features.consumer;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> f1 = (s) -> s.toUpperCase();
	static Function<String, String> f2 = (s) -> s.concat(" features");
	
	public static void main(String[] args) {
		
		System.out.println("f1 result::"+f1.apply("java-8"));
		System.out.println("f2 result::"+f2.apply("java-8"));
		
		System.out.println("and then result::"+f1.andThen(f2).apply("java-8"));
		System.out.println("compose result::"+f1.compose(f2).apply("java-8"));

	}

}
