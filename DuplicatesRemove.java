package com.triveni;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesRemove {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,7,9,12,14,6,3,6,19,1);
		
//		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
//		
//		System.out.println(collect);/
		
		Set<Integer> collect = list.stream().collect(Collectors.toSet());
		
		System.out.println(collect);
	}

}
