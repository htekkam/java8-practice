package com.java8.features.consumer;

import java.util.List;
import java.util.function.BiConsumer;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class BiConsumerExample {
	
	static void printConsumerDetails() {
		BiConsumer<String, List<String>> personBiConsumer = (name,hobbies) -> System.out.println(name+" "+hobbies);
		BiConsumer<String, Double> salaryBiConsumer = (name,salary) -> System.out.println(name+" "+salary);
		List<Person> personsList = PersonRepository.getAllPersons();
		
		personsList.forEach((person) -> {
			personBiConsumer.accept(person.getName(), person.getHobbies());
			salaryBiConsumer.accept(person.getName(), person.getSalary());
			
		});
	}
	
	

	public static void main(String[] args) {
		
		printConsumerDetails();

	}

}
