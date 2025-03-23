package com.linkedIn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Employee e1=new Employee(1,"Triveni",22,70000.00,"Female","Software","Hyd",2023);
		Employee e2=new Employee(2,"Gopi",25,45000.00,"Male","Senior developer","USA",2021);
		Employee e3=new Employee(3,"Sravanthi",23,48000.00,"Female","Tester","chennai",2018);
		Employee e4=new Employee(4,"Sahithya",21,38000.00,"Female","Analist","Guntur",2016);
		Employee e5=new Employee(5,"Revi",26,65000.00,"Male","Tech Lead","KPHB",2022);
		Employee e6=new Employee(6,"Chandu",19,32000.00,"Female","Junior developer","Tenali",2013);
		Employee e7=new Employee(7,"Laxmi",24,81000.00,"Female","Software","Vijaywada",2019);
		Employee e8=new Employee(8,"Shiva",29,26000.00,"Male","Reporter","Heven",2020);
		Employee e9=new Employee(9,"Nani",37,89000.00,"Male","Scrum master","Pune",2017);
		
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9);
		
		//Question 1.Grouping Employees by City
		
		Map<Object, List<Employee>> byCity = list.stream().collect(Collectors.groupingBy(e->e.getCity()));
		
		System.out.println(byCity);
		
		//Question 2: Grouping Employees by Age
		
		Map<Integer, List<Employee>> byAge = list.stream().collect(Collectors.groupingBy(e->e.getAge()));
		
		System.out.println(byAge);
		
		//Question 3: Finding the Count of Male and Female Employees
		
		Map<String, Long> countOfmalesFemales= list.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting()));
		
		System.out.println(countOfmalesFemales);
		
		//Question 4: Printing Names of All Departments
		
		Set<String> deptNames = list.stream().map(e->e.getDeptName()).collect(Collectors.toSet());
		
		System.out.println(deptNames);
		
		//Question 5: Printing Employee Details by Age Criteria age>25
		
		Set<Employee> data = list.stream().filter(age->age.getAge()>=25).collect(Collectors.toSet());
		
		System.out.println(data);
		
		
		//Question 6: Finding Maximum Age of Employee
		
		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(age->age.getAge())));
		
		System.out.println(max.get());
		
		//Question 7: Printing Average Age of Male and Female Employees
		
		Double avgage = list.stream().collect(Collectors.averagingDouble(age->age.getAge()));
		
		System.out.println(avgage);
		
		//Question 8: Printing the Number of Employees in Each Department
		
		Map<String, Long> dept = list.stream().collect(Collectors.groupingBy(dep->dep.getDeptName(),Collectors.counting()));
	
		System.out.println(dept);
	
		//Question 9: Finding the Oldest Employee age maximum.
	
		Optional<Employee> oldEmp = list.stream().collect(Collectors.maxBy(Comparator.comparing(age->age.getAge())));
	
		System.out.println(oldEmp);
	
		//Question 10: Finding the Youngest Female Employee
	
	
		Optional<Employee> oldFm = list.stream().filter(gender->gender.getGender().equals("Female")).collect(Collectors.minBy(Comparator.comparing(g->g.getGender())));
	
		System.out.println(oldFm);
	
		//Question 11: Finding Employees by Age Range age>25 ,partitioningBy this method

		Map<Boolean, List<Employee>> listage = list.stream().collect(Collectors.partitioningBy(age->age.getAge()>25));

		System.out.println(listage);
		
		//Question 12: Finding Department with Highest Number of Employees
		
		Map<String, Long> num = list.stream().collect(Collectors.groupingBy(dep->dep.getDeptName(),Collectors.counting()));
		System.out.println(num);
		
		//Question 13: Finding Employees from Software Department
		
		List<Employee> Sw = list.stream().filter(de->de.getDeptName().equals("Software")).collect(Collectors.toList());
		
		System.out.println(Sw);
		
		//Question 14: Finding Departments with Over 3 Employees
		
		
	}
}
