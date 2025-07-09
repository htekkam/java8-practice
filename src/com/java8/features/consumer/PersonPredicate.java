package com.java8.features.consumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class PersonPredicate {
	
	static Predicate<Person> heightGreathan140 = (person) -> person.getHeight()>=140;	
	static Predicate<Person> gender = (person) -> person.getGender().equalsIgnoreCase("Male");
	static Consumer<Person> personConsumer = (p) -> System.out.println(p.getName()+" has "+p.getHeight()+" cms height");

	public static void main(String[] args) {
		
		List<Person> personsList = PersonRepository.getAllPersons();
		
		personsList.stream().filter(heightGreathan140.and(gender)).forEach(personConsumer);

	}

}
