package com.java8.features.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c1 = (s1)-> System.out.println(s1.toUpperCase());
		c1.accept("hari krishna");
		Consumer<String> c2 = (s2) -> System.out.println(s2.toLowerCase());
		c2.accept("PANDU");
		
		//combining c1,c2 using and then method
		
		c1.andThen(c2).accept("tHariKrishTekkam");
		
		

	}

}
