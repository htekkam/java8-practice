package com.java8.features.streams;

import java.util.Comparator;
import java.util.Optional;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamReduceOnPerson {

	public static void main(String[] args) {
		
		System.out.println("Using reduct to print all the person names");
		
		String personNames = PersonRepository.getAllPersons()
		                .stream()
		                .map(Person::getName)
		                .reduce("", (a,b) -> a.concat(" ").concat(b));
		
		System.out.println("personNames::"+personNames);
		
		System.out.println("Printing tallest person without reduce");
		
		Optional<Person> findFirst = PersonRepository.getAllPersons()
		                .stream()
		                .sorted(Comparator.comparing(Person::getHeight).reversed())
		                
		                .findFirst();
		                
		System.out.println("Tallest person::"+findFirst.get());
		
		System.out.println("Printing tallest person with reduce() method");
		
		Optional<Person> tallestPerson = PersonRepository.getAllPersons()
		                .stream()
		                .reduce((p1,p2) -> p1.getHeight()>p2.getHeight() ? p1:p2);
		
		System.out.println(tallestPerson.get());

	}

}
