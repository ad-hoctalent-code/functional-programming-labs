package com.adhoc.java.functional.labs.streams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class StreamsLab {

	// TODO: replace "REPLACE_WITH_LAMBDA" to filter all the people older than 25
	@Test
	void olderThan25Test() {
		People.getSomePeople().stream()
				.filter(p -> p.age > 25)
				.forEach(System.out::println);
	}

	// TODO: replace "STREAM_OPERATION" and "REPLACE_WITH_LAMBDA" to filter all the
	// people with names of 5 letters
	@Test
	void namesOf5LettersTest() {
		People.getSomePeople().stream()
				.filter(p -> p.name.length() == 5)
				// .STREAM_OPERATION(REPLACE_WITH_LAMBDA)
				.forEach(System.out::println);
	}

	// TODO: replace TODO section on bellow method to get all the people younger
	// than 20 and print its name on uppercase
	@Test
	void namesonUpperCaseTest() {
		People.getSomePeople().stream()
				.filter(p -> p.age < 20)
				// TODO: streams operations as requested
				.forEach(System.out::println);
	}

	// TODO: replace TODO section on bellow method to get the oldest person and
	// print its name
	@Test
	void olderPersonTest() {
		People.getSomePeople().stream()
				// TODO: streams operations as requested
				.forEach(System.out::println);
	}

	// TODO: replace TODO section on bellow method to sort all the people and print
	// them (not just the name, the complete object)
	@Test
	void sortPeopleByNameTest() {
		People.getSomePeople().stream()
				// TODO: streams operations as requested
				.forEach(System.out::println);
	}

	// TODO: replace TODO section on bellow method to calculate the avg age of the
	// people list
	@Test
	void avgAgePeopleTest() {
		People.getSomePeople().stream()
		// TODO: streams operations as requested
		;
	}

	// TODO: replace TODO section on bellow method to search for any person
	@Test
	void findOldestPersonBeetween25And40Test() {
		People.getSomePeople().stream()
		// TODO: streams operations as requested, then uncomment bellow line
		// .ifPresent(System.out::println)
		;
	}

	// TODO: replace TODO section on bellow method to gather all the Persons whose
	// name starts with R in a List, then print it
	@Test
	void collectPeopleTest() {
		People.getSomePeople().stream()
		// TODO: streams operations as requested, then uncomment bellow line
		// .ifPresent(System.out::println)
		;
	}

	// TODO: replace TODO section on bellow method to sort all the people by salary
	@Test
	void sortPeopleBySalaryTest() {
		People.getSomePeople().stream()
				// TODO: streams operations as requested, then uncomment bellow line
				.forEach(System.out::println);
	}

	// TODO: replace TODO section on bellow method to sort all the people by salary
	// and when 2 or more have the same salary sort those by name
	@Test
	void sortPeopleBySalaryAndNameTest() {
		People.getSomePeople().stream()
				// TODO: streams operations as requested, then uncomment bellow line
				.forEach(System.out::println);
	}

	// TODO: replace TODO section on bellow method to group people in 2 groups by
	// their age, 1 older than 25, the other younger or equal than 25
	@Test
	void groupPeopleByAgeTest() {
		People.getSomePeople().stream()
		// TODO: streams operations as requested, then uncomment bellow line
		;
	}
	
	// TODO: replace TODO section on bellow method to print all the people who earn less than 25k sorted by salary (use takeWhile)
		@Test
		void collectAllPeopleWhoEarnLessThan25KTest() {
			People.getSomePeople().stream()
			// TODO: streams operations as requested, then uncomment bellow line
			.forEach(System.out::println);
		}
		
		// TODO: replace TODO section on bellow method to print all the people who earn less than 25k sorted by salary(use dropWhile)
				@Test
				void collectAllPeopleWhoEarnMoreThan25KTest() {
					People.getSomePeople().stream()
					// TODO: streams operations as requested, then uncomment bellow line
					.forEach(System.out::println);

				}

}

class People {
	public String name;
	public int age;
	public int roundedSalary;

	public People(String name, int age, int roundedSalary) {
		super();
		this.name = name;
		this.age = age;
		this.roundedSalary = roundedSalary;
	}

	static List<People> getSomePeople() {
		List<People> peopleList = List.of(new People("Cori", 28, 40000)
				,new People("Jason", 18, 15000)
				,new People("Pedro", 40, 80000)
				,new People("Maria", 38, 80000)
				,new People("Roberto", 18, 6000)
				,new People("Raul", 23, 23000)
				,new People("Petra", 18, 12000));

		return peopleList;
	}

	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}
}