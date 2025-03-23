package com.triveni;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedOrder {

	public static void main(String[] args) {
			
			List<Integer> asList = Arrays.asList(1,13,5,16,2,12,18,19,7,14);
			
			List<Integer> collect = asList.stream().sorted().collect(Collectors.toList());
			
			System.out.println(collect);
	}
}
