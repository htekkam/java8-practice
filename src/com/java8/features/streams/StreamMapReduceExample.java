package com.java8.features.streams;

import java.util.Optional;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamMapReduceExample {

	public static void main(String[] args) {
		
		//getting the  person repository and calculating sum of the kids
		
		Optional<Integer> totalKids = PersonRepository.getAllPersons()
		                .stream()
		                .map(Person::getKids)
		                .reduce(Integer::sum);
		System.out.println("Total kids are::"+totalKids);
		

	}

}
