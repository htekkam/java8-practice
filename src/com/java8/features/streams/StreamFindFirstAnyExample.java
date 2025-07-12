package com.java8.features.streams;

import java.util.Optional;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamFindFirstAnyExample {

	public static void main(String[] args) {
		
		
		System.out.println("Returning firs person which matches the given predicate");
		Optional<Person> findFirst = PersonRepository.getAllPersons()
		                .stream()
		                .filter((person) -> person.getHeight()>150)
		                .findFirst();
		                
	   Person firstPerson = findFirst.isPresent()? findFirst.get() : null;
	   if(firstPerson!=null)
		   System.out.println("firstPerson::"+firstPerson);
	   else
		   System.out.println("No such person exist in the repo");
	   
	   Optional<Person> findAny = PersonRepository.getAllPersons()
               .parallelStream()
               .filter((p) -> p.getHeight()>150)
               .findAny();
	   
	   Person anyPerson = findAny.isPresent()? findAny.get() : null;
	   if(anyPerson!=null)
		   System.out.println("anyPerson::"+anyPerson);
	   else
		   System.out.println("No such person exist in the repo");
	   
			   

	}

}
