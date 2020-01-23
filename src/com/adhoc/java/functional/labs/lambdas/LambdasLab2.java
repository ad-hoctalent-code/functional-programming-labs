package com.adhoc.java.functional.labs.lambdas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LambdasLab2 {
	
	List<String> filterStrings(String[] stringArray,Predicate<String> test) {
		List<String> result = new ArrayList<>();
		for(String string:stringArray) {
			if(test.test(string)) {
				result.add(string);
			}
		}
		return result;
	}
	
	@Test
	void PredicateTest() {
		//TODO: replace "REPLACE_WITH_LAMBDA" with a lambda expression to get all the Strings starting with "C", then uncomment bellow lines
		Predicate<String> test= s -> s.startsWith("C");
		Assertions.assertEquals(1,filterStrings(new String[] {"Cori","Jason","Pedro","Maria","Roberto","Raul","Petra"},test).size());
		
		//TODO: replace "REPLACE_WITH_LAMBDA" with a lambda expression to get all the Strings with 5 letter, then uncomment bellow lines
		Predicate<String> test2= s -> s.length() == 5;
		Assertions.assertEquals(4,filterStrings(new String[] {"Cori","Jason","Pedro","Maria","Roberto","Raul","Petra"},test2).size());
		
		//TODO: replace "REPLACE_WITH_LAMBDA" with a lambda expression to get all the Strings with 5 letter that ends in "a", then uncomment bellow lines
		Predicate<String> test3= s -> s.length() == 5 && s.endsWith("a");
		Assertions.assertEquals(2,filterStrings(new String[] {"Cori","Jason","Pedro","Maria","Roberto","Raul","Petra"},test3).size());
		
		//TODO: replace "REPLACE_WITH_LAMBDA" with a lambda expression to get all the Strings that its second character is an "o", then uncomment bellow lines
		Predicate<String> test4= s -> s.charAt(1) == 'o';
		Assertions.assertEquals(2,filterStrings(new String[] {"Cori","Jason","Pedro","Maria","Roberto","Raul","Petra"},test4).size());
	}
	
	
	void consumeStrings(String[] stringArray,Consumer<String> consumer) {
		for(String string:stringArray) {
			consumer.accept(string);
		}
	}
	
	@Test
	void ConsumerTest() {
		//TODO: replace "REPLACE_WITH_LAMBDA" with a lambda expression to print all the Strings, then uncomment bellow lines
		Consumer<String> consumer = s -> System.out.println(s);
		consumeStrings(new String[] {"Cori","Jason","Pedro","Maria","Roberto","Raul","Petra"}, consumer);
		
		//TODO: replace "REPLACE_WITH_LAMBDA" with a lambda expression to print all the Strings on upperCase, then uncomment bellow lines
		Consumer<String> consumer2 = s -> System.out.println(s.toUpperCase());
		consumeStrings(new String[] {"Cori","Jason","Pedro","Maria","Roberto","Raul","Petra"}, consumer2);
		
		//TODO: replace "REPLACE_WITH_LAMBDA" with a lambda expression to print the length of all the Strings like string:lenght, then uncomment bellow lines
		Consumer<String> consumer3 = s -> System.out.println(s + ": " + s.length());
		consumeStrings(new String[] {"Cori","Jason","Pedro","Maria","Roberto","Raul","Petra"}, consumer3);
	}
	
	static List<People> getSomePeople(){
		List<People> peopleList = new ArrayList<>();
		peopleList.add(new People("Cori",28));
		peopleList.add(new People("Jason",18));
		peopleList.add(new People("Pedro",40));
		peopleList.add(new People("Maria",38));
		peopleList.add(new People("Roberto",18));
		peopleList.add(new People("Raul",23));
		peopleList.add(new People("Petra",18));
		
		return peopleList;
	}
	static List<String> getSomePeopleNames(){
		List<String> peopleList = new ArrayList<>();
		peopleList.add("Cori");
		peopleList.add("Jason");
		peopleList.add("Pedro");
		peopleList.add("Maria");
		peopleList.add("Roberto");
		peopleList.add("Raul");
		peopleList.add("Petra");
		
		return peopleList;
	}
	
	List<String> mapPeopleToNames(List<People> peopleList,Function<People,String> mapper) {
		List<String> peopleNames = new ArrayList<>();
		for(People person:peopleList) {
			peopleNames.add(mapper.apply(person));
		}
		return peopleNames;
	}
	
	//TODO: complete mapPeopleToAges to convert a list of People into its age
	 List<Integer> mapPeopleToAges(List<People> peopleList, Function<People, Integer> mapper) {
		 List<Integer> peopleAges = new ArrayList<>();
		 for (People person : peopleList) {
			 peopleAges.add(mapper.apply(person));
		 }
		 return peopleAges;
	 }
	
	@Test
	void FunctionTest() {
		//TODO: replace "REPLACE_WITH_LAMBDA" with a lambda expression to convert of all the People objects into its name value, then uncomment bellow lines
		Function<People,String> mapper = p -> p.name;
		List<String> peopleNames = mapPeopleToNames(getSomePeople(),mapper);
		Assertions.assertEquals(getSomePeopleNames(), peopleNames);
		
		// TODO: first complete mapPeopleToAges, 
		// TODO: then replace "REPLACE_WITH_LAMBDA" with a lambda expression to convert of all the People objects into its age value
		// TODO: then get the average of them , then uncomment bellow lines
		Function<People,Integer> mapper2 = p -> p.age;
		List<Integer> peopleAges = mapPeopleToAges(getSomePeople(),mapper2);
		double avgAge = 0.0;
		for (int ages : peopleAges) {
			avgAge += ages;
		}
		 avgAge = avgAge/peopleAges.size();
		Assertions.assertEquals(26.0, avgAge);
	}
	

	
	@Test
	void SupplierTest() {
		//TODO: replace "REPLACE_WITH_LAMBDA" with a lambda expression to supply the array: {1,2,3,4,5}, then uncomment bellow lines
		Supplier<int[]> supplier= () -> new int[] {1,2,3,4,5};
		Assertions.assertEquals(new int[] {1,2,3,4,5}, supplier.get());
	}

}
class People{
	public String name;
	public int age;
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
