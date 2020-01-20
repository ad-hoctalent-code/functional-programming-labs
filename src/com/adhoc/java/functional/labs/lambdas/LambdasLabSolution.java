package com.adhoc.java.functional.labs.lambdas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LambdasLabSolution {
	
	List<Integer> filterOddNumbers(int[] array) {
		List<Integer> result = new ArrayList<>();
		for(int val:array) {
			if(val%2==1) {
				result.add(val);
			}
		}
		return result;
	}
	

	@Test
	void filterOddNumbersTest() {
		List<Integer> result = filterOddNumbers(new int[]{1,1,2,3,5,8,13,21});
		Assertions.assertEquals(6, result.size());
	}
	
	
	//TODO: rewrite filterOddNumbers to apply Strategy and accept a lambda
	List<Integer> filterOddNumbers(int[] array, EvenOddNumber eo) {
		List<Integer> result = new ArrayList<>();
		for(int val:array) {
			if(eo.test(val)) {
				result.add(val);
			}
		}
		return result;
	}
	
	//TODO: rewrite filterOddNumbersTest to use the lambda version of filterOddNumbers
	@Test
	void filterOddNumbersTest2() {
		List<Integer> result = filterOddNumbers(new int[]{1,1,2,3,5,8,13,21}, n -> n % 2 == 1);
		Assertions.assertEquals(6, result.size());
	}
	
	//TODO: rename filterOddNumbers to generalize its functionality, name it "filterNumbers"
	List<Integer> filterNumbers(int[] array, EvenOddNumber eo) {
		List<Integer> result = new ArrayList<>();
		for(int val:array) {
			if(eo.test(val)) {
				result.add(val);
			}
		}
		return result;
	}
	
	
	//TODO: complete this test to filter even numbers
	@Test
	void filterEvenNumbersTest() {
		
		List<Integer> result = filterNumbers(new int[]{1,1,2,3,5,8,13,21}, n -> n % 2 == 0);
		
		Assertions.assertEquals(2, result.size());
	}
	
}

@FunctionalInterface
interface EvenOddNumber{
	boolean test(int n);
	
}
