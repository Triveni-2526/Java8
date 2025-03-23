package com.triveni;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberGreaterThan5 {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,3,5,6,2,12,16,18,19);
		
		List<Integer> collect = asList.stream().filter(data->data>5).collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
