package com.java8.features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamMinMaxExample {
	
	static Optional<Person> getTallestPerson(){
		
		Optional<Person> collect = PersonRepository.getAllPersons()
		                .stream()
		                .collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));		
		return collect;
	}

	static List<Person> getTallestPersons(){
		
		List<Person> tallestPersonsList = new ArrayList<>();
		Optional<Person> tallestPerson = getTallestPerson();
		Person person = tallestPerson.isPresent() ? tallestPerson.get():null;
			
		if(null != person) {
			
			tallestPersonsList = PersonRepository.getAllPersons()
			                .stream()
			                .filter((per) -> per.getHeight()==person.getHeight())
			                .collect(Collectors.toList());
		}
		return tallestPersonsList;
	}
	public static void main(String[] args) {
		
		System.out.println("Tallest person::"+getTallestPerson().get());
		
		System.out.println("Tallest persons group::"+getTallestPersons());
		
		
	}

}
