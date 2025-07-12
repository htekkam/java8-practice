package com.java8.features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxingUnboxingExample {
	
	static List<Integer> boxedIntStream(){
		return IntStream.rangeClosed(1, 10) //creating primitive stream
			   .boxed().collect(Collectors.toList()); //boxing  and  returning
	}
	
	static int calculateSum(List<Integer> inputs) {
		return inputs.stream()
				.mapToInt(Integer::intValue) //un boxing with  maptoInt 
				.sum();
	}
	
	public static void main(String[] args) {	
		
			
		boxedIntStream().forEach(System.out::println);
		System.out.println("Calculating sum::"+calculateSum(boxedIntStream()));
		
	}
	

}
