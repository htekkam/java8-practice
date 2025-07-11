package com.java8.features.consumer;

import java.util.List;
import java.util.function.Supplier;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class SupplierExample {
	
	static Supplier<Person> singlePerson = () -> PersonRepository.getPerson();
	static Supplier<List<Person>> personList= () -> PersonRepository.getAllPersons();

	public static void main(String[] args) {
		
		System.out.println("Single person dispaly using supplier::"+singlePerson.get());
		
		System.out.println("Persons list using supplier::");
		
		personList.get().forEach(System.out::println);

	}

}
