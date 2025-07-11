package com.java8.features.streams;

import java.util.Comparator;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamCustomSortExample {

	public static void main(String[] args) {
		
		System.out.println("Displaying persons list based on name in reverse order");
		//getting persons repo
		PersonRepository.getAllPersons()
		                .stream()
		                .sorted(Comparator.comparing(Person::getName).reversed())
		                .forEach(System.out::println);

	}

}
