package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

import com.java8.features.repo.PersonRepository;

public class StreamLimitSkipExample {
	
	public static void main(String[] args) {
		
		//returning only the first 2 elements of the person repo
			
		PersonRepository.getAllPersons()
		                .stream()
		                .limit(2)
		                .forEach(System.out::println);
		
		List<Integer> input = Arrays.asList(1,3,5,7,8,9,10);
		
		//skipping the top 2 elements and returning the remaining list
		input.stream().skip(2).forEach(System.out::println);
		 
		
	}

}
