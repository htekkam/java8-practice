package com.java8.features.terminal_streams;

import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamsCountSumAvgExample {

	public static void main(String[] args) {
		
		System.out.println("Counting total distinct names\n in person repository using counting()");
		
		Long distinctNames = PersonRepository.getAllPersons()
		.stream()
		.map(Person::getName)
		.distinct()
		.collect(Collectors.counting());
		
		System.out.println("distinctNames::"+distinctNames);
		
		System.out.println("Calculating sum of all kids");
		
		int totalKids = PersonRepository.getAllPersons()
		.stream()
		.map(Person::getKids)
		.collect(Collectors.summingInt(Integer::intValue));
		
		System.out.println("totalKids::"+totalKids);
		
		double avgSalary = PersonRepository.getAllPersons()
		.stream()
		.map(Person::getSalary)
		.collect(Collectors.averagingDouble(Double::doubleValue));
		
		System.out.println("avgSalary::"+avgSalary);
		
		
		
		

	}

}
