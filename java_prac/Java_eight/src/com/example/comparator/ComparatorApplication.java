package com.example.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Employee> emp= new ArrayList<>();
         emp.add(new Employee("Sibashish",322729,56850,"SP&T"));
         emp.add(new Employee("Amit",322725,50017,"SP&T"));
         emp.add(new Employee("Ashwini",322714,48765,"SP&T"));
         emp.add(new Employee("Swastik",322709,54210,"SP&T"));
         Collections.sort(emp, new SalaryComparator());
         System.out.println(emp);
         Collections.sort(emp, new IdComparator());
         System.out.println(emp);
	}

}
