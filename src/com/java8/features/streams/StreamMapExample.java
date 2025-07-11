package com.java8.features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamMapExample {

	public static void main(String[] args) {
		
		System.out.println("Printing person names length");
		PersonRepository.getAllPersons()
		                .stream() //converting to stream
		                .map(Person::getName) //getting person  names using map
		                .map(String::length) //getting names length using map
		                .forEach(System.out::println);
		
		System.out.println("Printing person names with first letter capital");
		PersonRepository.getAllPersons()
		                .stream()
		                .map(Person::getName)
		                .map(String::toUpperCase)
		                .forEach(System.out::println);
		
		System.out.println("Demonstrating flat map");
		
		List<Integer> evenNumbersList = Arrays.asList(2,4,6,8);
		List<Integer> oddNumbersList = Arrays.asList(1,3,7,9,11);
		
		List<List<Integer>> mergedList = Arrays.asList(evenNumbersList,oddNumbersList);
		System.out.println("Before flatterning the merged list::"+mergedList);
		
		List<Integer> flattenList = mergedList.stream()
				                              .flatMap(List::stream)
				                              .sorted(Comparator.reverseOrder())
				                              .collect(Collectors.toList())
				                              ;
		
		System.out.println("After flattening and sorting in descending order::"+flattenList);
		
		System.out.println("Getting count of all the distinct hobbies");
		
		long hobbiesCount = PersonRepository.getAllPersons()
		                .stream()
		                .map(Person::getHobbies)
		                .flatMap(List::stream)
		                .distinct()
		                .count();
		System.out.println("Count of distinct hobbies is "+hobbiesCount);

	}

}
