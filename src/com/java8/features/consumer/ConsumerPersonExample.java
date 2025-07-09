package com.java8.features.consumer;

import java.util.List;
import java.util.function.Consumer;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class ConsumerPersonExample {
	
	static List<Person> personsList = PersonRepository.getAllPersons();
	static Consumer<Person> c1 = (person)-> System.out.println(person);
	static Consumer<Person> c2 = (person)-> System.out.println(person.getName().toUpperCase());
	
	static void getNamesAndHobbies() {
		personsList.forEach(c1.andThen(c2));
	}
	static void printWithConditions() {
		personsList.forEach((person)->{
			if(person.getName().startsWith("H"))
				c1.andThen(c2).accept(person);
		});
	}

	public static void main(String[] args) {
		
		
		c1.andThen(c2).accept(PersonRepository.getPerson());
		getNamesAndHobbies();
		printWithConditions();

	}

}
