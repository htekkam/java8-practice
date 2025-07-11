package com.java8.features.methodreference;

import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class MethodReferenceExample {
    
	//creating a lambda expression without method reference	
	static Function<String, String> f1 = (s) -> s.toUpperCase();
	
	//creating a lambda expression with method reference
	static Function<String, String> f2 = String::toUpperCase;
	
	static Predicate<Person> heightPredicate = MethodReferenceExample::heightCheck;
	
	//creating a lambda expersion with mehtod
	
	static boolean heightCheck(Person person) {
		return person.getHeight()>140;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Using f1::"+f1.apply("Without method referece"));
		System.out.println("Using f2::"+f2.apply("With method reference"));
		System.out.println("Using predicate and method reference::"+ heightPredicate.test(PersonRepository.getPerson()));

	}

}
