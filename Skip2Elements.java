package com.triveni;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip2Elements {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,3,5,6,7,8,19,14,19);
		
		List<Integer> collect = asList.stream().skip(2).collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
