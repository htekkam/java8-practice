package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
	
	
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(1,2,3,4,5);
		Integer sum = input.stream()
		     .reduce(1, (a,b) -> a*b);
		System.out.println("Sum::"+sum);
		
		
		     
		
	}

}
