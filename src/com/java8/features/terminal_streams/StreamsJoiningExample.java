package com.java8.features.terminal_streams;


import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import java.util.List;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamsJoiningExample {

	public static void main(String[] args) {
		
		String allNames = PersonRepository.getAllPersons()
		.stream()
		.map(Person::getName)
		.collect(Collectors.joining());
		
		String allNamesWithDelim = PersonRepository.getAllPersons()
		.stream()
		.map(Person::getName)
		.collect(Collectors.joining(",", "[", "]"));
		
		System.out.println("allNames::"+allNames);
		System.out.println("allNamesWithDelim::"+allNamesWithDelim);
		
		List<String> collect = PersonRepository.getAllPersons()
		.stream()
		.collect(mapping(Person::getName, Collectors.toList()));
		
		System.out.println("Returning names list with mapping inside collect method");
		System.out.println(collect);
	}

}
