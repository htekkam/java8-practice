package com.java8.features.streams;

import java.util.function.Predicate;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamFilterExample {
	
	static final String GENDER_MALE = "Male";

	public static void main(String[] args) {
		//creating a predicate to filter  based on height		
		Predicate<Person> p1 = (person) -> person.getHeight()>150;
		
		//creating a predicate to filter based on gender
		Predicate<Person> p2 = (person) -> person.getGender().equals(GENDER_MALE);
		
		//applying these p1,p2 on person repo using filters and displaying them
		
		PersonRepository.getAllPersons()
		                .stream()
		                .filter(p1.and(p2))
		                .forEach(System.out::println);
		

	}

}
