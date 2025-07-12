package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class StreamAllMatchAnyMatchExample {

	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(1,5,6,3,4,-1);
		
		boolean areAllNumbersPositive = input.stream().allMatch((i) -> i>0);
		System.out.println("areAllNumbersPositive::"+areAllNumbersPositive);
		
		boolean isAnyNumberPositive = input.stream().anyMatch((i) -> i>0);
		System.out.println("isAnyNumberPositive::"+isAnyNumberPositive);

	}

	
}
