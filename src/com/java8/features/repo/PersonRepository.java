package com.java8.features.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepository {

	public static List<Person> getAllPersons() {
		
		List<Person> people = new ArrayList<>();

        people.add(new Person("John", 165, 75000.0, "Male", 2, Arrays.asList("Cricket", "Swimming")));
        people.add(new Person("John", 185, 99000.0, "Male", 2, Arrays.asList("Cricket", "Chess")));
        people.add(new Person("Alice", 160, 82000.0, "Female", 1, Arrays.asList("Reading", "Yoga")));
        people.add(new Person("Bob", 172, 90000.0, "Male", 3, Arrays.asList("Gaming", "Cricket")));
        people.add(new Person("Sophia", 158, 95000.0, "Female", 0, Arrays.asList("Painting", "Tennis")));
        people.add(new Person("Campell", 165, 72000.0, "Male", 1, Arrays.asList("Swimming", "Tennis")));
        people.add(new Person("David", 180, 65000.0, "Male", 2, Arrays.asList("Running", "Cycling")));
        people.add(new Person("Emily", 162, 83000.0, "Female", 1, Arrays.asList("Reading", "Running")));
        people.add(new Person("Frank", 175, 70000.0, "Male", 0, Arrays.asList("Gaming", "Tennis")));
        people.add(new Person("Grace", 168, 88000.0, "Female", 2, Arrays.asList("Swimming", "Cricket")));
        people.add(new Person("Henry", 169, 76000.0, "Male", 3, Arrays.asList("Chess", "Yoga")));
        people.add(new Person("Isabel", 161, 82000.0, "Female", 0, Arrays.asList("Painting", "Cycling")));
        people.add(new Person("Jack", 178, 91000.0, "Male", 1, Arrays.asList("Cricket", "Football")));
        people.add(new Person("Karen", 163, 79000.0, "Female", 2, Arrays.asList("Yoga", "Running")));
        people.add(new Person("Leo", 170, 86000.0, "Male", 0, Arrays.asList("Chess", "Gaming")));
        people.add(new Person("Mia", 159, 73000.0, "Female", 3, Arrays.asList("Reading", "Swimming")));
        people.add(new Person("Nathan", 177, 94000.0, "Male", 2, Arrays.asList("Football", "Tennis")));
        people.add(new Person("Olivia", 164, 81000.0, "Female", 1, Arrays.asList("Painting", "Cycling")));
        people.add(new Person("Peter", 180, 87000.0, "Male", 0, Arrays.asList("Gaming", "Running")));
        people.add(new Person("Queenie", 160, 89000.0, "Female", 2, Arrays.asList("Cricket", "Chess")));
        people.add(new Person("Robert", 174, 92000.0, "Male", 3, Arrays.asList("Swimming", "Yoga")));
        people.add(new Person("Sara", 167, 85000.0, "Female", 0, Arrays.asList("Tennis", "Cycling")));
        people.add(new Person("Tom", 176, 76000.0, "Male", 2, Arrays.asList("Chess", "Football")));
        people.add(new Person("Uma", 162, 78000.0, "Female", 1, Arrays.asList("Yoga", "Running")));
        people.add(new Person("Victor", 179, 91000.0, "Male", 1, Arrays.asList("Swimming", "Reading")));
        people.add(new Person("Wendy", 161, 73000.0, "Female", 2, Arrays.asList("Painting", "Tennis")));

		return people;
	}

	public static Person getPerson() {
		return new Person("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
	}
	
	public static Optional<Person> getPersonOptional() {
		Person per = getPerson();
		per.setAddress(Optional.of(new Address("7 th Block", "Ashburn", "Virginia", "USA", 20047)));
		return Optional.of(per);
	}

}
