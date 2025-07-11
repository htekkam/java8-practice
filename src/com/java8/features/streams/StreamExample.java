package com.java8.features.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamExample {

	public static void main(String[] args) {
		
		System.out.println("getting the distinct hobbies from persons list");
		
		// 
		PersonRepository.getAllPersons() //list of persons
		                .stream() //converting to stream
		                .map(Person::getHobbies) //stream of list<String>
		                .flatMap(List::stream) //flatmap to convert it to stream of strings
		                .distinct() //getting distinct values here hobbies
		                .collect(Collectors.toList())
		                .forEach(System.out::println);
		
		PersonRepository.getAllPersons() //list of persons
        .stream() //converting to stream
        .peek(System.out::println)
        .map(Person::getName) //stream of list<String>
        .peek(System.out::println)
        .collect(Collectors.toList());
        //.forEach(System.out::println);

	}

}
