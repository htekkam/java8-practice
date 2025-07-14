package com.java8.features.terminal_streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import java.util.stream.Stream;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamGrouping {

	public static void main(String[] args) {
		
		//getting person data and grouping by gender
		
		Map<String, List<Person>> collect = PersonRepository.getAllPersons().stream()
		                .collect(Collectors.groupingBy(Person::getName));
		
		System.out.println("Printing male and female lists from the map  ");
		
		collect.entrySet().forEach(person -> System.out.println("Key::"+person.getKey()+" value::"+person.getValue()));
		
		System.out.println("Printing male and female lists in another way");
		
		Stream.of(collect).forEach(System.out::println);
		
		System.out.println("printing person with maximum height from each group");
		collect.entrySet()
		.forEach((person) -> {
			Optional<Person> collect2 = person.getValue().stream().collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));
		    System.out.println(collect2.get());
		});
		
		System.out.println("grouping based on a criteria");
		
		Map<String, List<Person>> groupByHeight = PersonRepository.getAllPersons().stream()
		.collect(Collectors.groupingBy(person -> person.getHeight()>145 ? "Tallest":"Shortest"));
		
		Stream.of(groupByHeight).forEach(System.out::println);
		
		System.out.println("Two level grouping");
		Map<String, Map<String, List<Person>>> twoLevelGrouping = PersonRepository.getAllPersons().stream()
		.collect(Collectors.groupingBy(Person::getGender, groupingBy(p -> p.getHeight()>140 ? "Tall" :"Short")));
		
		Stream.of(twoLevelGrouping).forEach(System.out::println);
		
		System.out.println("Three level grouping");
		
		HashMap<String, List<Person>> threeLevelGrouping = PersonRepository.getAllPersons().stream()
		.collect(Collectors.groupingBy(Person::getName, HashMap::new, Collectors.toList()));
		
		Stream.of(threeLevelGrouping).forEach(System.out::println);
		
		Map<String, Map<String, Map<String, List<Person>>>> multilevelGrouping =
				PersonRepository.getAllPersons().stream().collect(Collectors.groupingBy(
			        Person::getGender,                            // Level 1: Gender
			        Collectors.groupingBy(
			            p -> p.getHeight() > 140 ? "Tall" : "Short", // Level 2: Height
			            Collectors.groupingBy(
			                p -> p.getSalary() > 50000 ? "High" : "Low"  // Level 3: Salary
			            )
			        )
			    ));

		
		System.out.println("Multi-level-grouping");
		Stream.of(multilevelGrouping).forEach(System.out::println);
		
				

	}

}
