package com.java8.features.consumer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class FunctionPersonExample {
	
	static Predicate<Person> lessThan = (person) -> person.getHeight() < 140;
	
	static BiFunction<List<Person>,Predicate<Person>, Map<String, Double>> biFunction = (list,predicate) ->{
		Map<String, Double> personMap = new HashMap();
		list.forEach((person) -> {
			if(predicate.test(person))
				personMap.put(person.getName(), person.getSalary());
				
		});
		
		return personMap;
	};
	
	static Function<List<Person>, Map<String, Double>> functionPerson = (list) -> {
		Map<String, Double> personMap = new HashMap();
		list.forEach((person) -> {
			if(lessThan.test(person))
				personMap.put(person.getName(), person.getSalary());
		});
		return personMap;
	};

	public static void main(String[] args) {
		
		List<Person> personsData = PersonRepository.getAllPersons();
		Map<String, Double> map = functionPerson.apply(personsData);
		Map<String, Double> mapWithBifunction = biFunction.apply(personsData, lessThan);
		
		System.out.println("Person map::"+map);
		System.out.println("Person map using BiFunction::"+mapWithBifunction);
		

	}

}
